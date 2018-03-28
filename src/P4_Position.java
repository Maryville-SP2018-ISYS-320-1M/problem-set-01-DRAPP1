/*
  	ISYS 320
  	Name(s): Dave Rapp
  	Date: 3-26-18
*/

public class P4_Position {

	public static void main(String[] args) {
		double s0 = 16.0;
		double v0 = 8.5;
		double a = 4.4;
		double t = 20.0;

		double s = s0 + v0 * t + 0.5 * a * t * t;
		System.out.println(s);
	}

}
