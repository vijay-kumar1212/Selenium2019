package nov14;

public class Palindrum {

	public static void main(String[] args) {
		/*int num = 121, reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        // reversed integer is stored in variable */
              
        
        int num1 = 11221, revrsdInteger = 0, remaindr, orignalInteger;
        orignalInteger = num1;
        // reversed integer is stored in variable
        for( ;num1 != 0; num1 /= 10 )
        {
            remaindr = num1 % 10;
            revrsdInteger = revrsdInteger * 10 + remaindr;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (orignalInteger == revrsdInteger)
            System.out.println(orignalInteger + " is a palindrome.");
        else
            System.out.println(orignalInteger + " is not a palindrome.");
	
	}

}
