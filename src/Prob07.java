//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
//we can see that the 6th prime is 13.
//What is the 10 001st prime number?
public class Prob07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int theone=2;
		for(int i = 0;i<10001; ){
			if(isPrime(theone)){
				i++;
			}
			theone++;
		}
		System.out.println(theone-1);
	}

	private static boolean isPrime(int n){
		for(int i = 2 ; i <= Math.sqrt(n) ; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
