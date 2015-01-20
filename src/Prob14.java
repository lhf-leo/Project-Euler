/**
 * The following iterative sequence is defined for the set of positive integers:

n ¡ú n/2 (n is even)
n ¡ú 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 ¡ú 40 ¡ú 20 ¡ú 10 ¡ú 5 ¡ú 16 ¡ú 8 ¡ú 4 ¡ú 2 ¡ú 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
Which starting number, under 1000000, produces the longest chain?
 * @author Leo	
 *
 */
public class Prob14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		for(long i=1000000;i>1;i--){
			int count=0;
			long n=i;
			while(n>1){
				if(n%2==0){
					n/=2;
				}
				else if(n%2==1){
					n=n*3+1;
				}
				count++;

			}
			if(count>=max){
				System.out.println(i);
				max=count;
			}
		}

	}

}
