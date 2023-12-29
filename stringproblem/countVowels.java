package stringproblem;

public class countVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "JavadeVeloper";
		char []a = s.toLowerCase().toCharArray();
		int count =0;
		for (char c : a) {
			switch (c) {
			case 'a';
			case 'e';
			case 'i';
			case 'o';
			
			case 'u';
			count ++;
		
	
			}
		}
            System.out.println(count);
	}

}
