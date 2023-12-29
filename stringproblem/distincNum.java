package stringproblem;
public class distincNum {
	public static void main(String[] args) {
           String s1= "tapankumar";
           while (s1.length()>0) {
        	   char c= s1.charAt(0);
        	   String s2= s1.replace (c+"","");
        	   int n = s1.length()-s2.length();
        	   System.out.println(c+" ="+n);
        	   s1=s2;        }
           		}
}
