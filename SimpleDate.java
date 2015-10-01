import java.util.Arrays;
public class SimpleDate implements Comparable<SimpleDate> { //
	
	private int date;
	private int month;
	
	public SimpleDate(int m, int d){
		date=d;
		month=m;
	}
	
	public int date(){
		return date;
	}
	public int month(){
		return month;
	}
	
	public String toString(){
		return String.format("%d/%d",month,date);
	}
	
	public int compareTo(SimpleDate s){
		if (date==s.date() && month==s.month()){ //if same date same month
			return 0;
		}
		//if bigger month or same month bigger date
		else if(month>s.month()|| (date>s.date()&&month==s.month())){ 
			return 1;
		}
		else{
			return -1;
		}
	}
	
	public static void main (String [ ] args) {
		
	    SimpleDate [ ] dArray = new SimpleDate [4];
	    dArray[0] = new SimpleDate (5, 2); // 5/2
	    dArray[1] = new SimpleDate (2, 9); // 2/9
	    dArray[2] = new SimpleDate (6, 3); // 6/3
	    dArray[3] = new SimpleDate (1, 11); // 1/11
	    Arrays.sort (dArray);
	    for (int k=0; k<dArray.length; k++) {
	        System.out.println(dArray [k]);
	    }
	    // should print the dates in chronological order:
	    // 1/11, 2/9, 5/2, 6/3
	}
	
}
