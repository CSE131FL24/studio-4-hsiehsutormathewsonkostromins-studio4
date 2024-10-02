package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		Color purply = new Color(231, 175, 255);
		StdDraw.setPenColor(purply);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.01);
		StdDraw.filledRectangle(0.5, 0.4, 0.3, 0.01);
		StdDraw.filledRectangle(0.5, 0.6, 0.3, 0.01);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.01, 0.2);
		StdDraw.filledRectangle(0.4, 0.5, 0.01, 0.2);
		StdDraw.filledRectangle(0.6, 0.5, 0.01, 0.2);
	}
}
