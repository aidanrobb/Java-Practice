package edu.buffalo.cse116;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProperQueueTest {

	@Test
	public void addTest() {
		Double elem = 3.9;
		Double elem2 = 9.7;
		ProperQueue<Double> test = new ProperQueue<Double>();
		Entry <Double> entry1 = new Entry<Double>();
		Entry <Double> entry2 = new Entry<Double>();
		entry1.setElement(elem);
		entry1.setNext(entry2);
		entry2.setElement(elem2);
		test.setHead(entry1);
		test.setTail(entry2);
		assertTrue(test.add(entry1.getElement()));
		assertEquals(1, test.size());
		assertTrue(test.add(entry2.getElement()));
		assertEquals(2, test.size());
			}
	@Test
	public void addNullTest() {
		Double elem = null;
		ProperQueue<Double> test = new ProperQueue<Double>();
		Entry <Double> entry1 = new Entry<Double>();
		entry1.setElement(elem);
		test.setHead(entry1);
		test.setTail(entry1);
		assertTrue(test.add(entry1.getElement()));
		
	}
			
	@Test
	public void removeTest() {
		String elem = "Hello";
		String elem2 = "Hi";
		String elem3 = "Sup";
		ProperQueue<String> test2 = new ProperQueue<String>();
		Entry <String> entry1 = new Entry<String>();
		Entry <String> entry2 = new Entry<String>();
		Entry <String> entry3 = new Entry<String>();
		entry1.setElement(elem);
		entry1.setNext(entry2);
		entry2.setElement(elem2);
		entry2.setNext(entry3);
		entry3.setElement(elem3);
		entry3.setNext(null);
		test2.setHead(entry1);
		test2.setTail(entry3);
		test2.add(entry1.getElement());
		test2.add(entry2.getElement());
		test2.add(entry3.getElement());
		assertEquals(entry1.getElement(), test2.remove());
		assertEquals(entry2.getElement(), test2.remove());
			}
	@Test(expected = EmptyQueueException.class)
	public void testRemoveWhenEmpty() {
	 ProperQueue<String> test3 = new ProperQueue<String>();
	 test3.remove();
			  }
			
	@Test
		public void elementTest() {
			Integer elem = 1;
			Integer elem2 = 78;
			Integer elem3 = 745;
			ProperQueue<Integer> test4 = new ProperQueue<Integer>();
			Entry <Integer> entry1 = new Entry<Integer>();
			Entry <Integer> entry2 = new Entry<Integer>();
			Entry <Integer> entry3 = new Entry<Integer>();
			entry1.setElement(elem);
			entry1.setNext(entry2);
			entry2.setElement(elem2);
			entry2.setNext(entry3);
			entry3.setElement(elem3);
			entry3.setNext(null);
			test4.setHead(entry1);
			test4.setTail(entry3);
			test4.add(entry1.getElement());
			test4.add(entry2.getElement());
			test4.add(entry3.getElement());
			assertEquals(entry1.getElement(),test4.element());
			assertFalse(entry2.getElement() == test4.element());
			}
	
	@Test
	public void removeNullTest() {
		Integer elem = null;
		ProperQueue<Integer> test4 = new ProperQueue<Integer>();
		Entry<Integer> entry1 = new Entry<Integer>();
		entry1.setElement(elem);
		test4.setHead(entry1);
		test4.setTail(entry1);
		test4.add(entry1.getElement());
		assertTrue(test4.remove() == null);
	}

	
	@Test(expected = EmptyQueueException.class)
	public void testElementWhenEmpty() {
	 ProperQueue<String> test5 = new ProperQueue<String>();
	 test5.element();
			  }

		}
