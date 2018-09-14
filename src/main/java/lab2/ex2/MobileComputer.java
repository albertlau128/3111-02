package lab2.ex2;

public class MobileComputer extends Computer{
	private int bat;
	public MobileComputer() {
		secret = "MobileComp secret!";
		bat=5;
	}
	@Override
	public void work() {
		if (bat>0) System.out.println("It's working on my lap. Bat level = "+(bat--));
		else System.out.println("Running out of battery!");
	}
	public void charge() {
		if (bat<10)bat++;
	}
}
