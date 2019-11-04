
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import com.itextpdf.text.BadElementException;
import java.awt.AWTException;
import java.io.IOException;
import java.util.Scanner;


@SuppressWarnings("unused")
public class screenshotter {
	
	// global variable for count 
	public static int count = 0; 
	
	private static final Pattern NEXTBUTTON = new Pattern(screenshotter.class.getResource("NextButton.png"));
	
	public static void main(String[] args) throws FindFailed, AWTException, IOException, BadElementException {
		
		Screen screen = new Screen();
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for(int i = 0 ; i < 3 ; i++) {
			String name = Integer.toString(count);
			System.out.println(name);
			nextPage(screen);
			screencapper.screenCap(name);
			
			count++;
		}

	}
	
	public static void nextPage(Screen screen) {
		
			try {
				screen.wait(NEXTBUTTON.similar((float).09),30).click();
			} catch (FindFailed e) {
				System.out.print("Unable to find button");
				e.printStackTrace();
			}
	}

}
