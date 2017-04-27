import java.awt.*;
import java.awt.image.*;

import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Main {


	// *** The picture in which we hide our massage *****
	private static final String IMG_PATH = "insert a path of YOUR png file";
	

	public static void main(String[] args) {
		Scanner sc2 = null;
		String line="";
		try {
			sc2 = new Scanner(new File("insert a path of YOUR text file"));
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();  

		}
		while(sc2.hasNextLine()){
			line = sc2.nextLine();
		}
		System.out.println("hiding the text: " + line);
	
		
			try {
			BufferedImage img = ImageIO.read(new File(IMG_PATH));
			//ImageIcon icon = new ImageIcon(img);
			//JLabel label = new JLabel(icon);
			//JOptionPane.showMessageDialog(null, label);

			byte[] imageInByte;

	        // convert BufferedImage to byte array
	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        ImageIO.write(img, "png", baos);
	        baos.flush();
	        imageInByte = baos.toByteArray();
	       
	        for (int i = 0; i < line.length(); i++) {
				byte b = (byte) line.charAt(i);
				
				
			}
	        
	        
	        
	        
	        baos.close();

	        // convert byte array back to BufferedImage
	        InputStream in = new ByteArrayInputStream(imageInByte);
	        BufferedImage bImageFromConvert = ImageIO.read(in);

	        ImageIO.write(bImageFromConvert, "png", new File("newImg containig text.png"));
			
			}		
			
			
			
			
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
