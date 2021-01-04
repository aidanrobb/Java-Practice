package edu.buffalo.cse116;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Instances of this class are used to represent a multiset -- a searchable collection in which one can add multiple
 * copies of an element.
 *
 * @author Carl Alphonce
 * @author Matthew Hertz
 * @param <E> Element type for this collection
 */
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

  @Override
  public int size() {
    return _size;
  }

  @Override
  public boolean isEmpty() {
    return _size == 0;
  }

  /**
   * Removes the first instance of the given object, if one can be found in the ArrayMultiSet. The method returns
   * {@code true} when an instance was successfully removed and {@code false} if an instance was not found.
   *
   * @param obj Object (or null) which we want to remove
   * @return {@code true} if {@code obj} was found and removed; {@code false} if a match could not be found.
   */
  @Override
  public boolean remove(Object obj) {
	  for (int i = 0 ; i< _size; i++) {
		  if (_store[i] != null && _store[i].equals(obj)) {
			  _size = _size -1;
			  _store[i]= _store[_size];
			  return true;
		  }
		  else if (_store[i] == null) {
			  _size = _size -1;
			  _store[i]= _store[_size];
			  return true;
		  }
		  
	  }
	 
	  	return false;
  }
  @Override
  public Iterator<E> iterator() {
    // To be discussed next week
    throw new UnsupportedOperationException();
  }
}