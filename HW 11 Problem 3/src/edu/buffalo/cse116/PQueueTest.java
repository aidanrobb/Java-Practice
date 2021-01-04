package edu.buffalo.cse116;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class PQueueTest<E extends Comparable<? super E>> {

	@Test
	  public void testadd1(){
	    PQueue<Integer> pq = new PQueue<Integer>();
	    	pq.add(1);
	    	assertEquals("Size is ", pq.size(),1);
	    	assertSame(pq.element(),1);
	    	pq.add(17);
	    	assertEquals("Size is ", pq.size(),2);
	    	assertSame(pq.element(),1);
	    	pq.add(12);
	      assertSame(pq.element(),1);
	      assertEquals("Size is ", pq.size(),3);
	      
	    
	  }
	@Test
	  public void testadd2(){
	    PQueue<Integer> pq = new PQueue<Integer>();
	    	pq.add(2);
	    	pq.add(4);
	    	pq.add(12);
	    	pq.add(45);
	      assertSame(pq.element(), 2);
	      assertEquals("Size is ", pq.size(),4);
	  }
	
	@Test
	  public void testadd3(){
	    PQueue<String> pq = new PQueue<String>();
	    	pq.add("Golf");
	    	pq.add("Echo");
	    	pq.add("Bravo");
	    	pq.add("Alpha");
	    	pq.add("Charlie");
	    	pq.add("FoxTrot");
	    	pq.add("Hotel");
	      assertSame(pq.element(), "Alpha");
	      assertEquals("Size is ", pq.size(),7);
	      
	  }
}
