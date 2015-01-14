/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 * @author hanfu
 *
 */

//notice if I use int but not long, it will go wrong!
public class Prob10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum=0;
		for(long i = 2;i<=2000000;i++){
			if(isPrime(i)){
				sum+=i;
			}
		}
		System.out.println(sum);
	}

	private static boolean isPrime(long n){
		for(long i = 2 ; i <= Math.sqrt(n) ; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
