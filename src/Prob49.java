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
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes = runEratosthenesSieve(1000,10000);
		//System.out.println(primes);
		for(int i = 1; i<primes.size()-1;i++){
			for(int j = 0;j<i;j++){
				for(int k =i+1;k<primes.size();k++){
					if(2*primes.get(i)==(primes.get(j)+primes.get(k))){						
						if(sortDigits(primes.get(i))==sortDigits(primes.get(j))&&sortDigits(primes.get(j))==sortDigits(primes.get(k))){
							System.out.println(primes.get(j)+" "+primes.get(i)+" "+primes.get(k));
						}
					}
				}
			}
			
		}
	}
	
	public static int sortDigits(int n){
		int[] d = new int[4];
		for(int i =0;i<d.length;i++){
			d[i]=n%10;
			n/=10;
		}
		int sorted_n=0;
		int temp=0;
		for(int j = d.length; j>0;j--){
			for(int i =1;i<j;i++){
				if(d[i-1]>d[i]){
					temp=d[i];
					d[i]=d[i-1];
					d[i-1]=temp;
				}
			}
			sorted_n=(sorted_n+d[j-1])*10;
		}
		return sorted_n;
	}
	
	public static ArrayList<Integer> runEratosthenesSieve(int lowerBound, int upperBound) {
	      int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
	      boolean[] isComposite = new boolean[upperBound + 1];
	      ArrayList<Integer> primeList=new ArrayList<Integer>();
	      
	      for (int m = 2; m <= upperBoundSquareRoot; m++) {
	            if (!isComposite[m]) {
	                  for (int k = m * m; k <= upperBound; k += m)
	                        isComposite[k] = true;
	            }
	      }
	      for (int m = lowerBound; m <= upperBound; m++)
	            if (!isComposite[m])
	                  primeList.add(m);
	      return primeList;
	}

}
