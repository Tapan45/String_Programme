package stringproblem;

public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1= "Tapan kumar sahoo";
        String [] a= s1.split(" ");
      System.out.println(a);
        String s2 ="";
        for (int i=a.length-1;i>=0;i--) {
       	System.out.println(a[i]);
        s2+= a[i];
    System.out.println(s2);
      if (i>0) {
       	s2+=" ";       }
        
	}System.out.println(s2);

}}
