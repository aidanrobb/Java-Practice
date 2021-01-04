package edu.buffalo.cse116;

import java.util.AbstractList;

/**
 * This class defines a few basic methods to get practice creating and traversing a linked list.
 *
 * @author Matthew Hertz
 * @param <E> Type of data held in this collection
 */
@SuppressWarnings("unused")
public class DLList<E> extends AbstractList<E> {

  /** Reference to the first node in our linked list. This will be null if the list is empty. */
  private Entry head;

  /** Reference to the last node in our linked list. This will be null if the list is empty. */
  private Entry tail;

  /** Number of elements currently in the list. */
  private int size;

  /**
   * Creates an empty list.
   */
  public DLList() {
    size = 0;
    head = null;
    tail = null;
  }

  /**
   * Creates a new linked list and initializes it so that it stores the elements from the given array in the identical
   * order.
   *
   * @param source Array holding the elements that should be stored in our new linked list.
   */
  public DLList(E[] source) {
	  if(source.length >0 ) {
	  size = source.length;
	  Entry head1 = new Entry();
	  head = head1;
	  head.setElement(source[0]);
	  head.setPrev(null);
	  for (int i = 1; i < size ; i++) {
		Entry entry = new Entry();
		entry.element = source[i];
		head.setNext(entry);
	  	}
	  
	  Entry tail1 = new Entry();
	  tail = tail1;
	  tail.setElement(source[size-1]);
	  tail.setNext(null);
	  	if (size == 1) {
		  tail = head;
	  	}
	  	if (size == 2) {
	  	 head.next = tail;
	  	 tail.prev = head;
	  	}
	  }  
 }
  

  /**
   * Allocates and returns a new array. The entries in this new array should be identical (and in the same order) as the
   * elements in the linked list.
   *
   * @return Array containing the elements in the linked list.
   */
  @Override
  public Object[] toArray() {
	  Object[] arr = new Object[size];
	  Entry trav = head;
	  for(int i = 0 ; i <size ; i++) {
		  arr[i] = trav.getElement();
		 trav = trav.getNext();
	  }
	  return arr;
  }

  /**
   * Returns the number of elements currently in this list.
   *
   * @return the number of elements in the list
   */
  @Override
  public int size() {
    return size;
  }

  @Override
  public E get(int idx) {
    // Skipped to give students practice on traversing a linked list
    throw new UnsupportedOperationException("Defining this method defeats the purpose of this homework. Sorry!");
  }

  /**
   * Class which defines the Entry instances ("nodes") in this doubly-linked-based list. Note that this class does not
   * specify a generic type, but instead uses the element type from the outer class.
   *
   * @author Matthew Hertz
   */
  @SuppressWarnings("unused")
  private class Entry {
    /** Element stored with the current entry. */
    private E element;

    /** Reference to the next entry in our linked list or null if this is the last link. */
    private Entry next;

    /** Reference to the previous entry in our linked list or null if this is the first link. */
    private Entry prev;

    /** Create a new, blank Entry. */
    public Entry() {
      element = null;
      next = null;
      prev = null;
    }

    // Auto-generated getters and setters for students who prefer using them.

    private E getElement() {
      return element;
    }

    private void setElement(E element) {
      this.element = element;
    }

    private Entry getNext() {
      return next;
    }

    private void setNext(Entry next) {
      this.next = next;
    }

    private Entry getPrev() {
      return prev;
    }

    private void setPrev(Entry prev) {
      this.prev = prev;
    }
  }

}