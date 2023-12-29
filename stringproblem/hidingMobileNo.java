package stringproblem;

public class hidingMobileNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String phoneNumber ="6370493817";
        String regx=phoneNumber.replaceAll(".(?=.{4})","*");
        System.out.println(regx);
	}

}
