package Enum;

enum color{
	HONDA,HERO,BOXER,TVS
};
public class Enum1 {
   
	public void test(color s) {
		switch(s) {
		case HONDA:System.out.println("200000");
		break;
		case HERO:System.out.println("100000");
		break;
		case BOXER:System.out.println("1500000");
		break;
		case TVS:System.out.println("250000");
		break;
		default :System.out.println("Sorry Bike Not Available ");
		break;
		}
	}
}
