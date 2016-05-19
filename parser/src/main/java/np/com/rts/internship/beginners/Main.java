package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  private String parseThis = "20160519150000-STX,6-3.0-CONF4";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    // Write your code here

      Double d = new Double("0");
    String parsing = parseThis;
    String[] parts = parsing.split("-");
    System.out.println(parts[2].trim());
    value = d.parseDouble(parts[2].trim());
  }

  public static void main(String[] args) {
    new Main();
  }
}
