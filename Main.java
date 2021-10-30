///////////////////////////////////////////////////////////////////////////////////////////
//Main.java
//Nicholas LeBlanc
//12/30/20
//Change a word to pig latin
///////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String pigLatin;
    String firstLetter;
    String lowercase;

    int wordLength;
    boolean done = false;
    String end = "end";

    while(!done){
      System.out.println("Please enter a word");
      String word = scan.nextLine();
      lowercase = word.toLowerCase();

      if(lowercase.equals(end)){
        done = true;
      }
      else{
        wordLength = word.length();
        firstLetter = word.substring(0, 1);
        word = word.substring(1, wordLength);
        pigLatin = word + firstLetter + "ay";
        System.out.println(pigLatin);
      }
    }
  }
}