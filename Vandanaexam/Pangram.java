import java.util.HashMap;
import java.util.Scanner;

class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		boolean ans = isPangram(str);

		if (ans) {
			System.out.println("String is pangram");
		} 
		else {
			System.out.println("String is not pangram");
		}
	}

	public static boolean isPangram(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch: str.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				ch = Character.toLowerCase(ch);
				if (!map.containsKey(ch)) {
					map.put(ch,1);
				}
				else {
					map.put(ch,map.get(ch)+1);
				}
			}
		}
		if (map.size() == 26) {
			return true;
		} 
		return false;
	}
}