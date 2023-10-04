package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setXscale(0,20);
		StdDraw.setYscale(0,16);
		
	
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(20,4,10,2);
		StdDraw.setPenColor(Color.white);
		StdDraw.filledRectangle(20,6,10,.25);
		StdDraw.setPenColor(Color.red);
		StdDraw.filledRectangle(20,8,10,2);
		StdDraw.setPenColor(Color.white);
		StdDraw.filledRectangle(20,10,10,.25);
		StdDraw.setPenColor(Color.green);
		StdDraw.filledRectangle(20,12,10,2);
		
	}
}