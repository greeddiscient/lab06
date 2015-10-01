
public class ModNCounter extends Counter{
	
	int mod;
	
	public static void main(String[] args){
		ModNCounter c= new ModNCounter(3);
		c.increment();
		System.out.println(c.myCount);
		c.reset();
		c.increment();
		System.out.println(c.myCount);
		c.increment();
		c.increment();
		c.increment();
		System.out.println(c.myCount);
	}
	
	public ModNCounter(int m){
		myCount= 0;
		mod=m;
	}
	
	public void increment(){
		myCount+=1;
		myCount%=mod;
	}
}
