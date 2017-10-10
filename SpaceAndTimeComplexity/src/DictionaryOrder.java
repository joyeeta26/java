import java.util.Scanner;

public class DictionaryOrder {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=scn.nextLine();
		Dictionary(str, "", false);
	}

	public static void Dictionary(String ques, String ans, Boolean b) {
		if (ques.length() == 0) {
			if (b) {
				System.out.println(ans);
			}
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char c = ques.charAt(i);

			String ros = ques.substring(0, i) + ques.substring(i + 1);
			if (b) {
				Dictionary(ros, ans + c, b);
			} else {
				if (c < ques.charAt(0)) {
					Dictionary(ros, ans + c, true);
				}
				if (c == ques.charAt(0)) {
					Dictionary(ros, ans + c, false);
				}

			}

		}
	}
}