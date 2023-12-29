package stringproblem;
public class lowerToUpperCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "TaPaNKumaR123";
		String s2=" ";
		for (int i =0;i<s1.length();i++) {
			char c= s1.charAt(i);
			System.out.println(c);
			if (c>='A' && c<='Z') {
				s2=s2+(c+"").toLowerCase();
			}else if (c>='a' && c<='z') {
				s2=s2+(c+"").toUpperCase();
			}else {
				s2=s2+c;
			}
//			System.out.println(s2);
		}System.out.println(s2);

	}

}
