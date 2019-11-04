import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

@SuppressWarnings("unused")
public class screencapper {

	
	public static void screenCap(String name) throws AWTException, IOException {
		
		
		    try{
		        Thread.sleep(1000);
		        Rectangle screensize = new Rectangle(0,100,1920,980);
		        System.out.println(screensize.toString());
		       // BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		        BufferedImage image = new Robot().createScreenCapture(screensize);

		        ImageIO.write(image, "jpg", new File("C:\\Users\\shahz\\Desktop\\PICS\\" + name + ".jpg"));
		    }
		    catch(Exception e){
		        e.printStackTrace();
		    }
		

	}
}
