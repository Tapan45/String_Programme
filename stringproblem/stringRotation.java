package stringproblem;

public class stringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "tapatapu";
		String str2= "taputapa";
		if (str1.length()!= str2.length()) {
			System.out.println("sry not rotation");
		}
		else  {
			str1=str1+str1;//tapataputapatapu;
			if(str1.indexOf(str2)!=-1) {
				System.out.println("rotation");
				
			}else {
				System.out.println("NOT ROTATION");
			}
		}

	}

}
