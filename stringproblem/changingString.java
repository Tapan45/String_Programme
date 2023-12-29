package stringproblem;

public class changingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Eelcome to java";
	//	int index = 0;
		char c= 'W';
		StringBuffer b = new StringBuffer(s);
		b.setCharAt(0,c);
         System.out.println(b);
	}

}
