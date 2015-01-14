/**
 * The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, 
 * is unusual in two ways: (i) each of the three terms are prime, 
 * and, (ii) each of the 4-digit numbers are permutations of one another.
 * There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, 
 * exhibiting this property, but there is one other 4-digit increasing sequence.
 * What 12-digit number do you form by concatenating the three terms in this sequence?
 */

import java.util.ArrayList;

public class Prob49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void runEratosthenesSieve(int lowerBound, int upperBound) {
	      int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
	      boolean[] isComposite = new boolean[upperBound + 1];
	      ArrayList<Integer> primeList=new ArrayList<Integer>();
	      
	      for (int m = 2; m <= upperBoundSquareRoot; m++) {
	            if (!isComposite[m]) {
	                  //System.out.print(m + " ");
	                  for (int k = m * m; k <= upperBound; k += m)
	                        isComposite[k] = true;
	            }
	      }
	      for (int m = upperBoundSquareRoot; m <= upperBound; m++)
	            if (!isComposite[m])
	                  primeList.add(m);
	}

}
