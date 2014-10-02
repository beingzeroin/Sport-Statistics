//Driver class to test all above classes
	public class SportDriver{
    public static void main(String []args){
Sport s1, s2, s3, s4,s5;
s1 = new Boxing ("Boxing", 2,"Boxing Gloves","Mohammad Ali");
s2 = new Tennis("Tennis",2, "Racquet","Roger Federer");
s3 = new Basketball("Basketball", 5, "","Michael Jordan");
s4 = new Baseball("Baseball", 9, "Baseball bat","Babe Ruth");
s5 = new Soccer ("Soccer",11,"none","Diego Maradona");
s1.print();
s2.print();
s3.print();
s4.print();
s5.print();
}
}