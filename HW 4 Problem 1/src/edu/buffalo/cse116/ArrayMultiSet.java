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

  /** Constant value used as the initial length of the backing store. */
  private static final int DEFAULT_ARRAY_LENGTH = 12;

  /**
   * Create a new empty multiset using the default initial capacity.
   */
  public ArrayMultiSet() {
    this(DEFAULT_ARRAY_LENGTH);
  }

  /**
   * Create a new multiset instance. The multiset should be empty, but the backing store should be initialized so that
   * it could hold the specified number of elements.<br/>
   * Prerequisite: {@code initialCapacity} must be non-negative (e.g., 0 or larger).
   *
   * @param initialCapacity Number of elements that the multiset's backing store should be able to provide.
   */
  public ArrayMultiSet(int initialCapacity) {
	  _store = (E[]) (new Object[initialCapacity]);
  }

  /**
   * Creates a new multiset instance so that it is a copy of the instance passed in the parameter.<br/>
   * Prerequisite: {@code original} cannot be {@code null}.
   *
   * @param original Non-null ArrayMultiSet instance we will be copying.
   */
  public ArrayMultiSet(ArrayMultiSet<E> original) {
	  	_size = original._size ;
	  	_store = (E[]) (new Object [_size]);
	  	
	  	for (int i = 0; i< _size ; i++) {
	  		_store[i]=original._store[i];
	  	}
	  	
	  	
	  	
	  	
	  	
  }

  @Override
  public boolean isEmpty() {
    return _size == 0;
  }

  @Override
  public int size() {
    return _size;
  }

  @Override
  public Iterator<E> iterator() {
    // To be discussed next week
    throw new UnsupportedOperationException();
  }
}