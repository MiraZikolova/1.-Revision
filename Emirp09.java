package methods09;

public class Emirp09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int number = 3;
		
		while (count<120) {
			
			if( ! isPrime(number) || isPalindrome(number) || !isPrime(reverseNumber(number))) {
				number++;
				continue;
			}
			
			System.out.println(number + "\t");
			count++;
			number++;
			if( count % 10 ==0) {
				System.out.println();
			}
		}
	}
	public static boolean isPrime( int aNumber ) {
		int maxDivider = (int) Math.ceil(Math.sqrt(aNumber));
		boolean isPrime = true;
		for( int i = 2; i <= maxDivider; i++) {
			if( aNumber % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public static boolean isPalindrome( int aNumber ) {
		
		return aNumber == reverseNumber(aNumber);
	}
	
	public static int reverseNumber( int aNumber ) {
		int copyNumber = aNumber;
		int reversedNumber = 0;
		while( copyNumber != 0 ) {
			int remainder = copyNumber%10;
			reversedNumber = reversedNumber*10 + remainder;
			copyNumber /= 10;
		}
		return reversedNumber;
	}
	
}
