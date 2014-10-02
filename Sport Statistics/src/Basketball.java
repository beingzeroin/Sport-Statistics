//extends from class Sport
public class Basketball extends Sport{
public Basketball(String name, int pl, String dev,String BPlayer){
super(name, pl,BPlayer,dev);
}

//unique print() method for this class 
public void print(){
System.out.println("Sport name: " + sportName);
System.out.println("Number of players allowed for team: " + noOfPlayers);
System.out.println("Best Basketball player of all times:" + bestPlayer);
System.out.println("--------------------------------------");
}
}