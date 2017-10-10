  import java.util.Scanner;

  public class StringEdit {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		int e = dr(s1, s2,new int[s1.length() + 1][s2.length() + 1]);
		System.out.println(e);
	}

	public static int dr(String s1, String s2,int strg[][]) {
		int rv = 0;

		if (s1.length() == 0 && s2.length() == 0) {
			return 0;
		}

		if (s2.length() == 0) {
			return s1.length();
		}
		if (s1.length() == 0) {
			return s2.length();
		}
		if (strg[s1.length()][s2.length()] != 0) {
			return strg[s1.length()][s2.length()];
		}
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		if (s1.charAt(0) == s2.charAt(0)) {
			 rv=dr(ros1, ros2,strg);
		} else {
			int t1 = 1+ dr(s1,ros2,strg);
			int t2 = 1+dr(ros1, ros2,strg);
			int t3 =1+ dr(ros1, s2,strg);
			int r = Math.min(t1, t2);
			rv = Math.min(r, t3);
       }
		strg[s1.length()][s2.length()] = rv;
		return rv;
	}

}
