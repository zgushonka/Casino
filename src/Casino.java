
public class Casino {
	
	public static int parity (int a) {
		return a & 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int ap = parity(a);
		
		int b = 5;
		int bp = parity(b);
		
		int c = 2541;
		int cp = parity(c);
		
		int d = 8;
		int dp = parity(d);
		
		System.out.println("value " + a + ", parity " + ap);
		System.out.println("value " + b + ", parity " + bp);
		System.out.println("value " + c + ", parity " + cp);
		System.out.println("value " + d + ", parity " + dp);
	}

}
