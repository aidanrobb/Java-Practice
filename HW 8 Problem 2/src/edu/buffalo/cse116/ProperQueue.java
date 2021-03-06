package edu.buffalo.cse116;

/**
 * Class implementing the functionality of a {@code Queue} using a linked list.
 *
 * @author Matthew Hertz
 * @param <E> Type of data stored within this Queue.
 */
public class ProperQueue<E> {
  /**
   * The first node in the linked list (or null if the list is empty). This is the end of the list where we remove
   * elements from.
   */
  private Entry<E> head;

  /**
   * The first node in the linked list (or null if the list is empty). This is the end of the list where we add elements
   * to include them on the queue.
   */
  private Entry<E> tail;

  /**
   * The number of elements currently in the queue.
   */
  private int size;

  /** Create a new (empty) instance of this class. */
  public ProperQueue() {
    head = null;
    tail = null;
    size = 0;
  }

  /**
   * Adds an item to the end of the queue. Traditionally, this is the only method available to add data to a Queue.
   *
   * @param elem Element to be added to the end of the queue.
   * @return True (since this method will always succeed)
   */
  public boolean add(E elem) {
	    Entry<E> newEntry = new Entry<E>();
	    if (tail== null) {
	       tail = newEntry;
	       newEntry.setElement(elem);
	       size +=1;
	       return true;
	    }
	    newEntry.setElement(elem);
	    tail.setNext(newEntry);
	    size += 1;
	    return true;
	  }

  /**
   * Removes and returns the element at the front of this queue.
   *
   * @return Element that was removed from the front of the Queue.
   */
  public E remove() {
	if(size>0) {
		if (head.getElement() == null) {
		       tail = null;
		       return null;
		    }
		E retVal = head.getElement();
	    head = head.getNext();
	    
	    return retVal;
	  }
	
	  else {
		  throw new EmptyQueueException();
	  }
  }

  /**
   * This returns (but, unlike {@link #remove}, does NOT remove) the element at the front of the queue
   *
   * @return Element that is at the front of the queue
   */
  public E element() {
	  if(size > 0 ) {
    E retVal = head.getElement();
    return retVal;
	  }
	  else {
		  throw new EmptyQueueException();
	  }
  }

  /**
   * Returns the number of elements in this Queue.
   *
   * @return Items available in the Queue.
   */
  public int size() {
    return size;
  }

  /**
   * Returns whether there are any elements in this Queue.
   *
   * @return True if the Queue does not have any elements; false otherwise.
   */
  public boolean isEmpty() {
    return size == 0;
  }

public Entry<E> getHead() {
	return head;
}

public void setHead(Entry<E> head) {
	this.head = head;
}

public Entry<E> getTail() {
	return tail;
}

public void setTail(Entry<E> tail) {
	this.tail = tail;
}

}