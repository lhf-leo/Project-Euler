//A palindromic number reads the same both ways. 
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.
public class Prob04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int large = 0;
		for(int i=999;i>=100;i--){
			for(int j=999;j>=100;j--){
				if(isPalindrome(i*j)&&i*j>large){
					large=i*j;
				};
			}
		}
		System.out.println(large);
	}

	private static boolean isPalindrome(int n){
		int reverse_n=0;
		int temp = n;
		while(temp!=0){
			reverse_n*=10;
			reverse_n+=temp%10;
			temp/=10;
		}
		
		if(n==reverse_n){
			return true;	
		}else{
			return false;
		}
	}
}
