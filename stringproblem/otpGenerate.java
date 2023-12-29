package stringproblem;

public class otpGenerate {
	public static void main(String[] args) {
		int randomNo= (int) (Math.random()*9000)+1000;
		String otp = String.valueOf(randomNo);
		System.out.println(otp);
	}}
