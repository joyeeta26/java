package compression;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hencoder ht = new Hencoder("aaaabbbccd");
		System.out.println(ht.encode("aaabbcccd"));
		System.out.println(ht.decode("0001010111111111110"));
	}

}
