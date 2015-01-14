/**The four adjacent digits in the 1000-digit number that have the greatest product 
 * are 9 × 9 × 8 × 9 = 5832.

73167176531330624919225119674426574742355349194934
96983520312774506326239578318016984801869478851843
85861560789112949495459501737958331952853208805511
12540698747158523863050715693290963295227443043557
66896648950445244523161731856403098711121722383113
62229893423380308135336276614282806444486645238749
30358907296290491560440772390713810515859307960866
70172427121883998797908792274921901699720888093776
65727333001053367881220235421809751254540594752243
52584907711670556013604839586446706324415722155397
53697817977846174064955149290862569321978468622482
83972241375657056057490261407972968652414535100474
82166370484403199890008895243450658541227588666881
16427171479924442928230863465674813919123162824586
17866458359124566529476545682848912883142607690042
24219022671055626321111109370544217506941658960408
07198403850962455444362981230987879927244284909188
84580156166097919133875499200524063689912560717606
05886116467109405077541002256983155200055935729725
71636269561882670428252483600823257530420752963450

Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. 
What is the value of this product?
 */

//thought it was a matrix, but just aim to let us consider as a continuous string.
public class Prob08 {

	public static void main(String[] args) {
		long max_prod=0;
		long product;
		int maxi=0 , maxj=0;
		int[][] cube = iniMatrix();
		for(int i = 0; i < 20 ; i++){
			for(int j =0;j+12<50;j++){
				product=1;
				for(int z=0;z<13;z++){
					if(cube[i][j+z]==0){
						product=0;
						break;
					}else{
						product*=cube[i][j+z];
					}

				}
				
				if(product>max_prod){
					maxi=i;
					maxj=j;
					max_prod=product;
				}
			}
		}
		for(int i = 0; i < 50 ; i++){
			for(int j =0;j+12<20;j++){
				product=1;
				for(int z=0;z<13;z++){
					if(cube[j+z][i]==0){
						product=0;
						break;
					}else{
						product*=cube[j+z][i];
					}
					
				}
				if(product>max_prod){
					maxi=i;
					maxj=j;
					//max_prod=product;
				}
			}
		}
		System.out.print(max_prod+" "+maxi+" "+maxj);
	}

	private static int[][] iniMatrix(){
		int[][] cube= new int[20][50];
		String origin="73167176531330624919225119674426574742355349194934 96983520312774506326239578318016984801869478851843 85861560789112949495459501737958331952853208805511 12540698747158523863050715693290963295227443043557 66896648950445244523161731856403098711121722383113 62229893423380308135336276614282806444486645238749 30358907296290491560440772390713810515859307960866 70172427121883998797908792274921901699720888093776 65727333001053367881220235421809751254540594752243 52584907711670556013604839586446706324415722155397 53697817977846174064955149290862569321978468622482 83972241375657056057490261407972968652414535100474 82166370484403199890008895243450658541227588666881 16427171479924442928230863465674813919123162824586 17866458359124566529476545682848912883142607690042 24219022671055626321111109370544217506941658960408 07198403850962455444362981230987879927244284909188 84580156166097919133875499200524063689912560717606 05886116467109405077541002256983155200055935729725 71636269561882670428252483600823257530420752963450";
		String[] rows=origin.split(" ");
		for(int i =0;i<20;i++){
			for(int j = 0 ; j < 50 ; j++){
				cube[i][j]=rows[i].charAt(j)- '0';
			}
		}
		return cube;
	}

}