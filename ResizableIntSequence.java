
public class ResizableIntSequence extends IntSequence {
	public ResizableIntSequence(int cap){
		super(cap);
	}
	
	public void add(int toBeAdded){
		if (size()==myValues.length){
			int[] a= new int[2*myValues.length];
			for (int i=0; i<myValues.length;i++){
				a[i]=myValues[i];
			}
			myValues=a;
			
		}
		
		super.add(toBeAdded);
		
	}
	
	public void insert(int toInsert, int insertPos){
		if (size()==myValues.length){
			int[] a= new int[2*myValues.length];
			for (int i=0; i<myValues.length;i++){
				a[i]=myValues[i];
			}
			myValues=a;
			
		}
		
		super.insert(toInsert, insertPos);
		
	}
	
	
	public void remove(int pos){
		super.remove(pos);
		if (size()==myValues.length/2){
			int[] a= new int[myValues.length/2];
			for (int i=0; i<a.length;i++){
				a[i]=myValues[i];
			}
			myValues=a;
		}
		
	}
	
}
