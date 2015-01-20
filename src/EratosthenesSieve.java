import java.util.ArrayList;


public class EratosthenesSieve {

	public static void main(String[] args){
		System.out.println(runEratosthenesSieve(100000));
	}

	public static ArrayList<Integer> runEratosthenesSieve(int upperBound) {
		ArrayList<Integer> primes=new ArrayList<Integer>();
		int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
		boolean[] isComposite = new boolean[upperBound + 1];
		for (int m = 2; m <= upperBoundSquareRoot; m++) {
			if (!isComposite[m]) {
				primes.add(m);
				for (int k = m * m; k <= upperBound; k += m)
					isComposite[k] = true;
			}
		}
		for (int m = upperBoundSquareRoot; m <= upperBound; m++)
			if (!isComposite[m])
				primes.add(m);//in some machines, print() may have no result.
		return primes;
	}
}
