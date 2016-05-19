package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  String[] strings = new String[] {
          "hello",
          "mello",
          "mell",
          "1mell",
          "hmmm",
          "h2mmm",
          "zxcvb",
          "asdf",
          "%$compli"
  };

  public Main() {
      // Write your code here
      int i,j;
      for (i = 0; i < strings.length; i++) {
          for (j = i + 1; j < strings.length; j++) {
              if (strings[i].compareTo(strings[j]) > 0) {
                  String temp = strings[j];
                  strings[j] = strings[i];
                  strings[i] = temp;              }
          }

          System.out.println(strings[i]);
      }
  }





  public static void main(String[] args) {
    new Main();
  }
}
