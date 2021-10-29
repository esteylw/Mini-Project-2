//@author Andrew Edelen, Ryan Schiell, Jacob Schloemer, Luke Estey
//@version 10/28/21 + 10/29/21

import java.util.*;

class Pillowcase {
  private
    ArrayList<Candy> candies; //Our master list of candies
    int candyIndex[] = new int[7]; //Our totaled list of candies
    int number; // Number of Houses
    //Let's name our candies so we can output them efficiently later
    String candyNames[] = {"M&Ms", "Pink Starburst","Hershey's Bar","Milky Way","Twix","Reese's","Kit Kat"};
    

  public
    static int maxSize = 1000;

    //Adding the values into the ArrayList
    Pillowcase() {
      candies = new ArrayList<Candy> ();

      number = 0;
    }
    //Get the max size of the bag
    int getMaxSize(){
      return maxSize;
    }

    //The method gets the candy
    void getCandy(){
      //this line should randomly generate a number
      //our random value must be between 1 and 100
      Random r = new Random();
      int randomInt = r.nextInt(100) + 1;
      //here we find out which candy number is equal to
      if (randomInt >= 1 && randomInt <= 10){
        System.out.println("Trick or Treat! We got M&M's!");
        number++;
        Candy newCandy = new Candy();
        newCandy.setCandyname("M&Ms");
        candies.add(newCandy);
      }
      else if (randomInt >= 11 && randomInt <= 30){
        System.out.println("Trick or Treat! We got Pink Starburst!");
        number++;
        Candy newCandy = new Candy();
        newCandy.setCandyname("Pink Starburst");
        candies.add(newCandy);
      }
      else if (randomInt >= 31 && randomInt <= 45){
        System.out.println("Trick or Treat! We got Hershey's Bar!");
        number++;
        Candy newCandy = new Candy();
        newCandy.setCandyname("Hershey's Bar");
        candies.add(newCandy);
      }
      else if (randomInt >= 46 && randomInt <= 55){
        System.out.println("Trick or Treat! We got Milky Way!");
        number++;
        Candy newCandy = new Candy();
        newCandy.setCandyname("Milky Way");
        candies.add(newCandy);
      }
      else if (randomInt >= 56 && randomInt <= 70){
        System.out.println("Trick or Treat! We got Twix!");
        number++;
        Candy newCandy = new Candy();
        newCandy.setCandyname("Twix");
        candies.add(newCandy);
      }
      else if (randomInt >= 71 && randomInt <= 95){
        System.out.println("Trick or Treat! We got Reese's!");
        number++;
        Candy newCandy = new Candy();
        newCandy.setCandyname("Reese's");
        candies.add(newCandy);
      }
      else if (randomInt >= 96 && randomInt <= 100){
        System.out.println("Trick or Treat! We got Kit Kat!");
        number++;
        Candy newCandy = new Candy();
        newCandy.setCandyname("Kit Kat");
        candies.add(newCandy);
      }
      else {
        System.out.println("Error generating candy name");
      }
    }

    //return the number of candy inside the pillowcase
    int getNumber(){
      return number;
    }
    //Return the percent of the bag that is filled
    double getPercentage(){
      //Typecast to double to avoid 0.0 return runtime error
      double dbNumber = number;
      double dbMaxSize = maxSize;
      double percentOfBag = dbNumber/dbMaxSize;
      percentOfBag = percentOfBag * 100;
      return percentOfBag;
    }

    //Add up the number of candies we have
    void totalNumCandies(){
     //Java defaults all uninitialized ints in an array to 0
     //Because of this, we can immediately start counting
     for(int i=0;i<candies.size();i++){
        if(candies.get(i).getName() == "M&Ms"){
          candyIndex[0]++;
        }
        else if(candies.get(i).getName() == "Pink Starburst"){
          candyIndex[1]++;
        }
        else if(candies.get(i).getName() == "Hershey's Bar"){
          candyIndex[2]++;
        }
        else if(candies.get(i).getName() == "Milky Way"){
          candyIndex[3]++;
        }
        else if(candies.get(i).getName() == "Twix"){
          candyIndex[4]++;
        }
        else if(candies.get(i).getName() == "Reese's"){
          candyIndex[5]++;
        }
        else if(candies.get(i).getName() == "Kit Kat"){
          candyIndex[6]++;
        }
     }
    }

    //Print out how many candies we have
    void printNumCandies(){
      for(int i=0; i < candyIndex.length; i++){
        if(candyIndex[i] != 0){
          System.out.println(candyNames[i] + ": " + candyIndex[i]);
        }
      }
    }
}