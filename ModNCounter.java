
public class ModNCounter extends Counter{
	
	int mod;
	
	public static void main(String[] args){
		ModNCounter c= new ModNCounter(3);
		c.increment();
		System.out.println(c.value());
		c.reset();
		c.increment();
		System.out.println(c.value());
		c.increment();
		c.increment();
		c.increment();
		System.out.println(c.value());
	}
	
	public ModNCounter(int m){
		mod=m;
		reset();
	}
	
	public void increment(){
		super.increment();
		if (value()%mod==0)
		{
			reset();
		}
	}
}
