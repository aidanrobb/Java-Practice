package edu.buffalo.cse116;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Instances of this class are used to represent a multiset -- a searchable collection in which one can add multiple
 * copies of an element.
 *
 * @author Carl Alphonce
 * @author Matthew Hertz
 * @param <E> Element type for this collection
 */
@SuppressWarnings("unchecked")
public class ArrayMultiSet<E> extends AbstractCollection<E> {
  /** Array in which the elements in this multiset are stored. */
  private E[] _store;

  /**
   * Array indices below this amount contain the active elements in this collection.
   */
  private int _size;
  /**
   * Modification counter used to preserve the fail-fast nature of its iterators.
   */
  private long _modCount;

  // Class invariants:
  // * _store has all of the elements in the multi-set.
  // * All elements in _store are in indices < _size

  /**
   * Create a new empty multiset using the default initial capacity.
   */
  public ArrayMultiSet() {
    // Skipped on behalf of problem #1 from this week
  }

  /**
   * Add the given element so that it is contained in the ArrayMultiSet
   *
   * @param e Item to include in this collection.
   * @return True when the element was successfully added; false otherwise. This always returns true.
   */
  @Override
  public boolean add(E e) {
    if (!storeHasSpace()) {
      expandBackingStore();
    }
    return addToStore(e);
  }

  /**
   * Adds the element to the next available entry in the backing store and updates the instance variables to maintain
   * the class invariant.
   *
   * @param e Element to be added to the backing store
   * @return True -- this will always succeed.
   */
  private boolean addToStore(E e) {
	  if(storeHasSpace() == true) {
		  _store[_size] = e;
		  _size = _size + 1;
		  return true;
	  }
	  return false;
  }

  /**
   * Checks if the backing store has space to add one more or elements to the ArrayMultiSet.
   *
   * @return Returns true when there is space in the backing store for another element; false otherwise.
   */
  private boolean storeHasSpace() {
	 
	  if(_size < _store.length) {
		  return  true;
	  }
	  else {
		  return false;
		  }
  }

  /**
   * "Grows" the backing store (or so it appears; it actually allocates a larger array and copies elements into the new
   * one) so that it is able to have another element.
   */
  private void expandBackingStore() {
	  _store = Arrays.copyOf(_store, _size*2);
  }

  @Override
  public int size() {
    return _size;
  }

  @Override
  public boolean isEmpty() {
    return _size == 0;
  }

  @Override
  public Iterator<E> iterator() {
    // To be discussed next week
    throw new UnsupportedOperationException();
  }
}