package edu.buffalo.cse116;

import java.util.List;

/** Instances of this class can be used to guarantee a list is sorted using the quick sort algorithm. */
public class QuickSort<E extends Comparable<E>> {
  /**
   * Starts the quick sort algorithm and returns the sorted list.
   *
   * @return List of data that has been ordered from smallest to largest
   */
  public List<E> sort(List<E> list) {
    return sort(list, 0, list.size() - 1);
  }

  /**
   * Performs quick sort on the list of data for the elements at indices from {@code lo} through {@code high},
   * inclusive. This is the private method of the recursion where all the work gets done.
   *
   * @param lo First index in {@code list} that this call will be working with
   * @param high Last index in {@code list} whose element this call will sort.
   * @return The list in which the elements from {@code lo} through {@code high} have been ordered from smallest to
   *         largest
   */
  private List<E> sort(List<E> list, int lo, int high) {
    // Base case: we have 0 or 1 element to sort
    if (lo >= high) {
      return list;
    }
    // Recursive step

    // Chose the pivot
    int pivotIdx = (lo + high) / 2;
    // Partition the data
    pivotIdx = partition(list, pivotIdx, lo, high);
    // Recurse!
    sort(list, lo, pivotIdx - 1);
    sort(list, pivotIdx + 1, high);
    // No combine step needed!
    return list;
  }

  /**
   * This is a helper method which partition the list into left and right parts. The left part of the list will contain
   * all of the values smaller than the pivot. The right part of the array list will contain all of the values larger
   * than the pivot. The pivot will be placed between these two parts
   *
   * @param pivotIdx Index at which the pivot to be use for this partitioning is found.
   * @param loIdx Leftmost index to be included in the partition
   * @param highIdx Rightmost index to be included in the partition
   * @return The index at which the pivot is eventually placed.
   */
  private int partition(List<E> list, int pivotIdx, int loIdx, int highIdx) {
//	  swap(list,pivotIdx,loIdx);
	  E piv = list.get(pivotIdx);
	  E low = list.get(loIdx);
	  list.set(loIdx, piv);
	  list.set(pivotIdx, low);  
	  pivotIdx =loIdx;
	  while(loIdx < highIdx) {
		  while(loIdx < highIdx && list.get(loIdx).compareTo(list.get(pivotIdx)) <= 0 ) {
			  loIdx = loIdx +1 ;
		  }
		  while(highIdx >= loIdx && list.get(highIdx).compareTo(list.get(pivotIdx)) > 0) {
			  highIdx = highIdx - 1;
		  }
		  if(loIdx >= highIdx) {
//			  swap(list,pivotIdx,highIdx);
			  E piv2 = list.get(pivotIdx);
			  E high = list.get(highIdx);
			  list.set(pivotIdx, high);
			  list.set(highIdx, piv2);
			  return highIdx;
		  }
//		  swap(list,loIdx,highIdx);
		  E low2 = list.get(loIdx);
		  E high = list.get(highIdx);
		  list.set(highIdx, low2);
		  list.set(loIdx, high);
	  }
	  return -1;
  }
}