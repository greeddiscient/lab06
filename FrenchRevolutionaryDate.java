public class FrenchRevolutionaryDate extends Date {

    // In a nonleap year in the French Revolutionary Calendar,
    // the first twelve months have 30 days and month 13 has five days.
    public FrenchRevolutionaryDate(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }

    @Override
    public int dayOfYear() {
        return (month() - 1) * 30 + dayOfMonth();
    }
    
    public FrenchRevolutionaryDate nextDate(){
    	int d= dayOfMonth();
    	int m= month();
    	int y= year();
    	if (m==13 && d==5){
    		y++;
    		d=1;
    		m=1;
    	}
    	else{
    		if (d==30){
    			m++;
    			d=1;
    		}
    		else{
    			d++;
    		}
    		
    	}
    	FrenchRevolutionaryDate next= new FrenchRevolutionaryDate(y,m,d);
    	return next;
    }
}
