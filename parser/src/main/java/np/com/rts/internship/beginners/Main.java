package np.com.rts.internship.beginners;

import com.sun.org.apache.bcel.internal.generic.NEW;

import org.omg.IOP.Encoding;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Pattern;

import sun.nio.cs.US_ASCII;


public class Main {

  private String parseThis = "3127162:261111\n" +
          "TUY-7.4/1\n" +
          "DPOG5";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    // Write your code here

      String chTOst=" ";
      Double d = new Double("0.0");

        try
        {
            for(int i = 0; i < parseThis.length(); i++)
            {

                int ascii = (int) parseThis.charAt(i);
                int a = ascii - 1;
                char New = (char)a;
                chTOst = chTOst + New;



            }
        }
        catch (UnknownFormatConversionException New)
        {
            New.printStackTrace();
        }

          System.out.println(chTOst);


          String[] parts = chTOst.split("");
          value = d.parseDouble(parts[22].trim());
          System.out.println(value);


  }

  public static void main(String[] args) {
    new Main();
  }
}
