package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
				String shapeType = in.next();
				
			
				StdDraw.setPenColor(Color.CYAN);
				StdDraw.filledRectangle(.5,.5,.4,.3);
				
				StdDraw.setPenColor(Color.DARK_GRAY);
				StdDraw.filledSquare(.5,.5,.3);
				
				StdDraw.setPenColor(Color.white);
				StdDraw.square(.5,.5,.2);
				
				StdDraw.setPenColor(Color.MAGENTA);
				StdDraw.circle(.5,.5,.3);
				
				StdDraw.setPenColor(Color.MAGENTA);
				StdDraw.filledEllipse(.5, .5, .1, .1);
		
			
	}
}