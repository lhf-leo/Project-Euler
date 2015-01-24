import java.util.ArrayList;


public class Uttam_prob {

	public static void main(String[] args) {
		// you can change the range
		int m = 8;
		int n = 100;
		
		for(int x = m ; x<=n; x++ ){
			for(int y = x ; y<=n ; y++ ){
				if(cbrtLest(x,y)){
					System.out.print(x);
					System.out.print(" ");
					System.out.println(y);
				}
			}
		}
		System.out.println("nail it!");
	}

	//for each same divisor of the two numbers, their exponents modular 3 must have the same leftover. 
	public static boolean cbrtLest(int x,int y){
		ArrayList<Integer> primes=runEratosthenesSieve(y);

		int temp=0;
		for(int i=0;i<primes.size();i++){
			temp=0;
			while(x%primes.get(i) == 0){
				x/=primes.get(i);
				temp++;
			}
			while(y%primes.get(i) == 0){
				y/=primes.get(i);
				temp--;
			}
			if(!(temp%3==0)){
				return false;
			}

		}
		return true;
	}

	//get a list of prime
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
