package edu.buffalo.cse116;

/**
 * This class can be used to compute a few statistics for a given data set. This will compute both the average and
 * standard deviation.
 *
 * @author Matthew Hertz
 */
public class StatUtils extends Exception {

  /**
   * Compute the mean value of the data in the array.
   *
   * @param arr Array of doubles whose average we want to compute.
   * @return Mean of the values in {@code data}.
   * @throws NoDataException Exception thrown if arr is null.
   * @throws DivideByZeroException Exception thrown when the array does not contain anything (its length is 0).
   */
  public static double computeMean(double[] arr) throws DivideByZeroException, NoDataException {
	 double sum = 0.0;
	  if (arr == null) {
		  throw new NoDataException();  
	  }
	  if (arr.length == 0) {
		  throw new DivideByZeroException();
	  }
	  for (int i = 0; i <arr.length ; i++) {
		  sum = sum +arr[i];
	  }
	  return sum/arr.length;
  }

  /**
   * Computes the standard deviation of the data in the array.
   *
   * @param arr Array of doubles whose standard deviation we want to compute.
   * @return Standard deviation of the values in {@code data}.
   * @throws InvalidDataSetException Exception thrown when the array is not large enough to compute a standard deviation
   *           (its length is 0 or 1).
   * @throws NoDataException Exception thrown when arr is null.
   */
  public static double computeStdDev(double[] arr) throws InvalidDataSetException, NoDataException {
	  double sum = 0.0;
	  if (arr == null) {
		  throw new NoDataException();
	  }
	  if(arr.length == 0) {
		  return 0;
	  }
	  
	  if(arr.length == 1) {
		  throw new InvalidDataSetException();
	  }
	  
	double mean = 0;
	try {
		mean = computeMean(arr);
	} catch (DivideByZeroException e) {
		e.printStackTrace();
	}
	
	for (int i = 0; i< arr.length; i++) {
		double val = arr[i];
	sum =sum + Math.pow((val - mean), 2);
	}
	double length = arr.length-1; 
	
  return Math.sqrt(sum/length);
  
  }

}