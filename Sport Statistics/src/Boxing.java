//extends from class Sport
public class Boxing extends Sport{
public Boxing(String name, int pl, String dev,String BPlayer){
super(name, pl,BPlayer,dev);

}// unique print() method for this class 
public void print(){
System.out.println("Sport name: " + sportName);
System.out.println("Number of players allowed in game: " + noOfPlayers);
System.out.println("Boxing is played with:  " + device);
System.out.println("Best Tennis Player of all times: " + bestPlayer);
System.out.println("--------------------------------------");
}
}