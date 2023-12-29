package stringproblem;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer t=new StringBuffer("tapan");
		StringBuffer a=new StringBuffer ("tapan");
		StringBuilder b =new StringBuilder("tapan");
		System.out.println(a.equals(t));
		System.out.println(a==t);
		System.out.println(b.equals(t));
		System.out.println();
		String p = new String ("java");
		String g = new String ("java");
		System.out.println(p==g);
	}

}
