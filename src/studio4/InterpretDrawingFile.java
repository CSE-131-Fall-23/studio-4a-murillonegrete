package studio4;

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
		Scanner in = new Scanner(f); // making Scanner with a File

		String type = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double perameterOne = in.nextDouble();
		double perameterTwo = in.nextDouble();
		double perameterThree = in.nextDouble();
		double perameterFour = in.nextDouble();
		

		if (type.equals("square")) {
			StdDraw.square(perameterOne, perameterTwo, perameterThree);

		} else if (type.equals("elipse")) {
			StdDraw.ellipse(perameterOne, perameterTwo, perameterThree, perameterFour);
		} 
		else {
			double five = in.nextDouble();
			double six = in.nextDouble();
			double [] x  = new double [3]; 
			x[0]= perameterOne; 
			x[1]= perameterThree;
			x[2] = five;
			double [] y = new double [3];
			y[0]=perameterTwo;
			y[1]= perameterFour;
			y[2]=six;
		StdDraw.polygon(x, y);
		
		}
	}
}
