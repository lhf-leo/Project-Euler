//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
import java.math.BigInteger ; 
public class Prob03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger n = new BigInteger("600851475143") ;
		for(BigInteger i = new BigInteger("2");i.compareTo(n)<=0;i=i.add(new BigInteger("1"))){
			if(n.remainder(i).intValue()==0&&n.compareTo(i)!=0){//notice usage of remainder and mod
				n=n.divide(i);
				i=i.subtract(new BigInteger("1"));
			}
			//System.out.println(n.mod(i));
		}
		System.out.println(n);
	}

}
