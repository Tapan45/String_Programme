package stringproblem;

public class isPALINDROME {

	static boolean isPallindrom(String s) {
		char []a= s.toCharArray();
		System.out.println(s);
		int i=0,j=a.length-1;
		while (i<j) {
			if (a[i]!= a[j]) 
				return false;
				i++;
				j--;
			
			//return true;//
		}
		return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(isPallindrom("malayalam"));
	}

}
