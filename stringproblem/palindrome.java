package stringproblem;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actual ="madam";
		String rev ="";
		for (int i=actual.length()-1;i>=0;i--)
		{
			rev=rev+actual.charAt(i);
		}System.out.println(actual);
		System.out.println(rev);
		
		if (actual.equals(rev)) {
			System.out.println("palindrom");
		

	}
		
	}

}
