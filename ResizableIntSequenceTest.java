import static org.junit.Assert.*;

import org.junit.Test;

public class ResizableIntSequenceTest {

	@Test
	public void testAdd() {
		ResizableIntSequence s= new ResizableIntSequence(2);
		s.add(0);
		s.add(1);
		System.out.println(s.size());
		s.add(1);
		System.out.println(s.size());
		assertEquals(s.size(),3);
	}
	
	@Test
	public void testInsert() {
		ResizableIntSequence s= new ResizableIntSequence(2);
		s.add(0);
		s.add(1);
		System.out.println(s.size());
		s.insert(7,1);
		System.out.println(s.size());
		assertEquals(s.size(),3);
		assertEquals(s.elementAt(1),7);
	}
	
	@Test
	public void testRemove() {
		ResizableIntSequence s= new ResizableIntSequence(8);
		s.add(0);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.remove(1);
		assertEquals(s.myValues.length,4);
		
	}
}
