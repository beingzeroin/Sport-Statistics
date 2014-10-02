//extends from class Sport
public class Tennis extends Sport{
public Tennis(String name, int pl, String dev,String BPlayer){
super(name, pl,BPlayer,dev);
}

//unique print() method for this class 
public void print(){
System.out.println("Sport name is: " + sportName);
System.out.println("Number of players allowed in game : " + noOfPlayers);
System.out.println("Tennis is played with a: " + device);
System.out.println("Best Tennis Player of all times: " + bestPlayer);
System.out.println("--------------------------------------");
}
}