/**
 * The prime 41, can be written as the sum of six consecutive primes:
41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.
The longest sum of consecutive primes below one-thousand that adds to a prime, 
contains 21 terms, and is equal to 953.
Which prime, below 1000000, can be written as the sum of the most consecutive primes?
 * @author hanfu
 *
 */
public class Prob50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int count=0;
		for(int i = 2; ; i++){
			if(isPrime(i)){
				if((sum+=i)>1000000){
					sum-=i;
					break;
				}
				count++;
			}
		}

		int jump=0;
		boolean isOver= false;
		boolean isAns= false;
		for(;count>0;count--){
			jump=0;
			isOver= false;
			for(;;){
				int tempj=jump;
				int tempc=count;
				sum=0;
				for(int i = 2;tempc>0 ; i++){
					
					if(isPrime(i)&&tempj>0){
						tempj--;
						continue;
					}

					if(isPrime(i)){
						tempc--;
						if((sum+=i)>1000000){
							sum-=i;
							isOver=true;
						}
					}
				}
					
				if(isPrime(sum)){
					isAns=true;
					break;
				}
				if(isOver){
					break;
				}
				jump++;
			}
			
			if(isAns){
				break;
			}
	
		}
		System.out.println(sum+" "+count);
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
