//extends from class Sport
public class Baseball extends Sport{
public Baseball(String name, int pl, String dev,String BPlayer){
super(name, pl,BPlayer,dev);
}
// unique print() method for this class 
public void print(){
System.out.println("Sport name:" + sportName);
System.out.println("Number of players allowed for team: " + noOfPlayers);
System.out.println("Basketball is played with a:" + device);
System.out.println("Best Baseball  layer of all times:" + bestPlayer);
System.out.println("--------------------------------------");
}
}
