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
    do{
      System.out.println("How many houses should we trick or treat at?");
      numHouses = s.nextInt();
      //Ensure number is not less than 0 or greater than the bag size
      if(numHouses > yourBag.getMaxSize()){
        System.out.println("Your bag can't fit that much candy!");
      }else if(numHouses <= 0){
        System.out.println("If you don't go to any houses, you won't get any candy!");
      }
    } while(numHouses > yourBag.getMaxSize() || numHouses <= 0);
    
    //Close the scanner to avoid resource leak
    s.close();

    //Load up the pillowcase
    for(int i=0;i<numHouses;i++){
      yourBag.getCandy();
    }

    //Total up the candy
    yourBag.totalNumCandies();

    //Output the total amount of candy
    System.out.println("We have " + yourBag.getNumber() + " candies, " + Double.toString(yourBag.getPercentage())+ "% of our pillowcase.");

    //Breakdown by candy type
    System.out.println("We got...");
    yourBag.printNumCandies();
  }
}