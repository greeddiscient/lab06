public class GregorianDate extends Date {

    public static int[] monthLengths = {31, 28, 31, 30, 31, 30, 31,
        31, 30, 31, 30, 31};

    public GregorianDate(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }

    @Override
    public int dayOfYear() {
        int rtnValue = 0;
        for (int m = 0; m < month() - 1; m++) {
            rtnValue += monthLengths[m];
        }
        return rtnValue + dayOfMonth();
    }
    
    public GregorianDate nextDate(){
    	int d= dayOfMonth();
    	int m= month();
    	int y= year();
    	if (d==monthLengths[m-1]){
    		m+=1;
    		d=1;
    		if (m==13){
    			
    			m=1;
    			y+=1;
    		}
    	}
    	else{
    		d+=1;
    	}
    	GregorianDate next= new GregorianDate(y,m,d);
    	return next;
    }

}
