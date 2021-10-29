//@author Andrew Edelen, Ryan Schiell, Jacob Schloemer, Luke Estey
//@version 10/28/21 + 10/29/21

class Candy {
  private String candysName;

  //the 2 candy constructors
  //the first constructor sets the name to blank
  public Candy(){
    candysName = "";
  }

  //the second constructor sets the candy's name equal to aName
  //@param requires the aName varaiable
  public Candy(String aName){
    candysName = aName;
  }

  //mutators that sets the candy's name
  //@param requires the newCandy variable 
  void setCandyname (String newCandy){
    candysName = newCandy;
  }

  // The method gets the String   candysName value
  //@returns candysName value
  public String getName(){
    return candysName;
  }
}