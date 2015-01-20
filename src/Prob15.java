/**
 * Starting in the top left corner of a 2¡Á2 grid, and only being able to move to the right and down,
 *  there are exactly 6 routes to the bottom right corner.
 *  How many such routes are there through a 20¡Á20 grid?
 * @author Administrator
 *
 */
public class Prob15 {

	public static void main(String[] args) {
		// pick 20 from 40 to turn right, answer is 40!/(20!*20!)
		long ans=1;
		for(int i=10;i<20;i++){
			ans*=(4*i+2);
			ans/=(i-9);

		}
		System.out.println(ans);
	}

}
