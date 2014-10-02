/**
 *  Create Sport class as superclass
 *  Inherit method of Sport class for (Basketball, Tennis, Boxing,Baseball,Soccer)
 *  Create own print() method for each class
 *  Create Sports objects and add parameters in SportDriver
 *  Use print() methods.
 * @author Oscar
 * Pseudo code 
class Sport { String sportName,int noOfPlayers,String best Player, String device() {} }
class  Baseball extends Sport{ super() {} }
class  Basketball extends Sport {super()}
class  Boxing extends Sport { super(){} }
class  Soccer extends Sport{ super() {} }
class  Baseball extends Sport { super() {} }
}
public class SportDriver {
 public static void main(String[] a) {
  	s1 = new Boxing()
	s2 = new Tennis()
	s3 = new Basketball()
	s4 = new Baseball()
	s5 = new Soccer()
	
	S1-S5.print()
  }
}
 */

//Base class
public class Sport{
//parameters for the constructor
public String sportName;
public int noOfPlayers;
public String bestPlayer;
public String device;
//constructor base for any sport
public Sport(String name, int pl, String BPlayer, String dev){
this.sportName = name;
this.noOfPlayers = pl;
this.bestPlayer = BPlayer;
this.device = dev;
}

public void print(){

}
}







