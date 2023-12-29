package stringproblem;

public class countCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String tapu = "tapu,tapa,bapan";
         int count=0;
         for (int i=0;i<tapu.length();i++) {
         if (tapu.charAt(i)!= ' ' && tapu.charAt(i)!= ',') {
        	 count++;
         }
	}System.out.println(count);
         }
}
