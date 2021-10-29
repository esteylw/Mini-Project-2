//@author Andrew Edelen, Ryan Schiell, Jacob Schloemer, Luke Estey
//@version 10/28/21 + 10/29/21

//Import scanner and random
import java.util.*;

class Main {
  public static void main(String[] args) {

    //Initialize our necessary variables
    int numHouses;
    Pillowcase yourBag = new Pillowcase();
    Scanner s = new Scanner(System.in);

    //Happy halloween output and get number of houses to visit
    System.out.println("Happy Halloween!");
    System.out.println("How many houses should we trick or treat at?");
    numHouses = s.nextInt();
    
    //Close the scanner to avoid resource leak
    s.close();

    //Load up the pillowcase
    for(int i=0;i<numHouses;i++){
      yourBag.getCandy();
    }

    //Total up the candy
    yourBag.totalNumCandies();

    //Output the number of each candy
    yourBag.printNumCandies();
  }
}