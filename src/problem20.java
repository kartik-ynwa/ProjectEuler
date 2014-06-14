import java.math.BigInteger;


public class problem20 {
	
	public static void main(String args[]) throws Exception{
		BigInteger n = new BigInteger("1");
		for (int i = 1; i <= 100; i++){
			n = n.multiply(new BigInteger(Integer.toString(i)));
		}
		String s = n.toString();
		System.out.println(s);
		int sum = 0;
		for (int i = 0; i < s.length();i++){
			sum += Character.getNumericValue(s.charAt(i));
		}
		System.out.println(sum);
	}

}
