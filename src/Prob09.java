/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 * @author hanfu
 *
 */
public class Prob09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i <=250 ;i++){
			for(int j = 1; j<=500;j++){
				if((1000-i-j)*(1000-i-j)==i*i+j*j){
					System.out.println(i*j*(1000-i-j));
				}
			}
		}
	}

}
