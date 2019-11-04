//import java.io.File;
 import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;


public class ImageToPDF {
	
	
  public static void jpegToPdf( String name ) throws BadElementException, MalformedURLException, IOException {
    
    
    String input = "C:\\Users\\shahz\\Desktop\\PICS\\0.jpg"; // .gif and .jpg are ok too!
    String output = "C:\\Users\\shahz\\Desktop\\PDF\\0.pdf";
    Image img = Image.getInstance(input);
  Rectangle pagesize = new Rectangle(2100,1200);


    Document document = new Document(pagesize);
    
    
    try {
      
      FileOutputStream fos = new FileOutputStream(output);
      PdfWriter writer = PdfWriter.getInstance(document, fos);
      
     //img.setAbsolutePosition(1920, 1080);
     img.scaleToFit(img.getScaledWidth(),img.getScaledHeight());
     
      //img.setBorderWidth(0);
      //img.scaleAbsolute(2000,1200);
     // img.scaleToFit(img.getWidth(), img.getHeight());
      writer.open();
      document.open();
      document.add(Image.getInstance(input));

      document.close();
      writer.close();
      
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}