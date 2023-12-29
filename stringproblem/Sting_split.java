package stringproblem;

public class Sting_split {
public static void main(String[] args) {
	String s="Soumya Ranjan Barik";
	String[] s1=s.split(" ");
	for(String a:s1) {
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
             if(i==0) {
            	 System.out.print(ch);
             }
		}
	}
	
}
}
