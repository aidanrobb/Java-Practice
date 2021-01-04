package edu.buffalo.cse116;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This class implements a PriorityQueue using a List. It is implemented so that elements are stored in sorted order.
 *
 * @author Matthew Hertz
 * @param <E> Type used for the element in this queue. To simplify coding, this type must be Comparable.
 */
public class PQueue<E extends Comparable<? super E>> {

  /** ArrayList holding the Entries in our PriorityQueue. */
  private List<E> linkedL;

  /**
   * Create a new instance of our priority queue that compares entries with a given key and value type. At the outset
   * this priority queue will be empty.
   */
  public PQueue() {
    linkedL = new LinkedList<E>();
  }


  /*
   * (non-Javadoc)
   * @see PriorityQueue#insert(java.lang.Object, java.lang.Object)
   */
  public boolean add(E elem) {
	 int i=0;
	while ( i  <= size()){
		
		 if (i == size()) {
			 linkedL.add(size(), elem);
			 return true;
		 }
		 else if(linkedL.get(i).compareTo(elem) == 0) {
			 linkedL.add(i, elem);
			 return true;
		 }
		 else if(linkedL.get(i).compareTo(elem) > 0) {
			 linkedL.add(i, elem);
			 return true;
		 }
		 else if(linkedL.get(i).compareTo(elem) < 0) {
			 i++;
		 }
		 
	}	 
	 
	 return false;
  }

  /*
   * (non-Javadoc)
   * @see PriorityQueue#min()
   */
  public E element() throws NoSuchElementException {
	  if(size() > 0) {
		  return linkedL.get(0);
	  }
	  else {
		  throw new NoSuchElementException();
	  }
  }

  /*
   * (non-Javadoc)
   * @see PriorityQueue#removeMin()
   */
  public E remove() throws NoSuchElementException {
	  if(size() > 0) {
		  E head = linkedL.get(0);
		  linkedL.remove(0);
		  return head;
	  }
	  else {
		  throw new NoSuchElementException();
	  }

  }

  /**
   * Returns if the priority queue currently contains any entries.
   *
   * @return True if the queue has no entries, false otherwise.
   */
  public boolean isEmpty() {
    return linkedL.isEmpty();
  }

  /**
   * Returns the number of entries currently in the priority queue.
   *
   * @return Number of entries that are currently stored in the priority queue.
   */
  public int size() {
    return linkedL.size();
  }
}