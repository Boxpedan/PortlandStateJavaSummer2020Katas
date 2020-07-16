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
    if(args.length == 0){
      System.err.println("Missing arguments");
      System.exit(1);
    }
    if(args.length > 1) {
      System.err.println("Wrong number of input.");
      System.exit(1);
    }
    //i == 5 A - E
    String arc = args[0];
    char ar = arc.charAt(0);
    int arc_len = arc.length();
    if(arc_len != 1) {
      System.err.println("Wrong format");
      System.exit(1);
    }

    Character.toUpperCase(ar);
    int leng = ar - 'A';

    char begin = 'A';
    for(int i = 0; i <= leng; i++){
      if(i == 0){
        String s = String.format("%"+leng+"s","");
        s+='A';
        s+= String.format("%"+leng+"s","");
        System.out.println(s);
        continue;
      }
      if(i == leng){
        begin++;
        String s = new String();
        s+= begin;
        s+=String.format("%"+i+"s","");
        s+=String.format("%"+i+"s","");
        s+= begin;
        System.out.println(s);
        break;
      }
      int temp = leng - i;
      begin++;
      String s = String.format("%"+temp+"s","");
      s+= begin;
      s += String.format("%"+i+"s","");
      s += String.format("%"+i+"s","");
      s+= begin;
      s+=String.format("%"+temp+"s","");
      System.out.println(s);
    }

    for (int j = leng; j >= 0; j--){
      if(j == 0){
        begin--;
        String s = String.format("%"+leng+"s","");
        s+='A';
        s+= String.format("%"+leng+"s","");
        System.out.println(s);
        break;
      }
      if(j == leng){
        String s = new String();
        s+= begin;
        s+=String.format("%"+j+"s","");
        s+=String.format("%"+j+"s","");
        s+= begin;
        System.out.println(s);
        continue;
      }
      int temp = leng - j;
      begin--;
      String s = String.format("%"+temp+"s","");
      s+= begin;
      s += String.format("%"+j+"s","");
      s += String.format("%"+j+"s","");
      s+= begin;
      s+=String.format("%"+temp+"s","");
      System.out.println(s);
    }


  }
}