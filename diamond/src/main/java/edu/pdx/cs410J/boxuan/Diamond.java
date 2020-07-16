package edu.pdx.cs410J.boxuan;

import javax.rmi.ssl.SslRMIClientSocketFactory;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {



  public static void main(String[] args) {
    if(args.length > 1) {
      System.err.println("Wrong number of input.");
      System.exit(1);
    }
    //i == 5 A - E
    String arc = args[0];
    char ar = arc.charAt(0);
    int arc_len = arc.length();
    if(arc_len != 0) {
      System.err.println("Wrong format");
      System.exit(1);
    }

    Character.toUpperCase(ar);
    int leng = ar - 'A';
    int diff = Character.toLowerCase('C') - Character.toLowerCase('A');

    char begin = 'A';
    for(int i = 0; i < leng; i++){
      int temp = leng - i;
      String s1 = String.format("%"+i+"s","");
    }

    for (int j = leng; j > 0; j--){

    }
  }
}