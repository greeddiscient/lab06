import java.awt.Point;
import java.util.ArrayList;

public class test {
	public static void main(String[] args){
		GregorianDate d= new GregorianDate(1992,12,31);
		GregorianDate n= d.nextDate();
		System.out.println(n.toString());
		FrenchRevolutionaryDate f= new FrenchRevolutionaryDate(1992,2,30);
		FrenchRevolutionaryDate next= f.nextDate();
		System.out.println(next.toString());
		
	}
}
