package day2;

public class mainprogram {
	public static void main(String[] args) {

	    String str = ""; 

	    int left = 0;

	    int right = str.length() - 1;

	    boolean isPalindrome = true;



	    while (left < right) {

	        if (str.charAt(left) != str.charAt(right)) {

	            isPalindrome = false;

	            break;

	        }

	        left++;

	        right--;

	    }



	    if (isPalindrome) {

	        System.out.println("It is a palindrome");

	    } else {

	        System.out.println("It is not a palindrome");

	    }

	}



}
