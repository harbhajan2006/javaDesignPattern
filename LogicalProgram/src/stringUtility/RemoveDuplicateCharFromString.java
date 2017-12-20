package stringUtility;

public class RemoveDuplicateCharFromString {
	public static void main(String[] args) {
		char str[] = "nitin".toCharArray();
		removeDuplicate(str);
	}

	private static void removeDuplicate(char[] str) {
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;
		int tail = 1;
		for (int i = 1; i < len; i++) {
			int j;
			for (j = 0; j < tail; j++) {
				if (str[i] == str[j])
					break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
				System.out.println(tail);
			}
		}
		System.out.println(str);
		str[tail] = 0;
		System.out.println(str);

	}

	public static String removeDuplicates(String word) {
		if (word == null || word.length() < 2) {
			return word;
		}
		int pos = 1;
		// possible position of duplicate character
		char[] characters = word.toCharArray();
		for (int i = 1; i < word.length(); i++) {
			int j;
			for (j = 0; j < pos; ++j) {
				if (characters[i] == characters[j]) {
					break;
				}
			}
			if (j == pos) {
				characters[pos] = characters[i];
				++pos;
			} else {
				characters[pos] = 0;
				++pos;
			}
		}
		return toUniqueString(characters);
	}

	// Read more:
	// http://javarevisited.blogspot.com/2016/06/how-to-remove-duplicate-characters-from-String-Java.html#ixzz4lDmEXiM8

	// Read more:
	// http://javarevisited.blogspot.com/2016/06/how-to-remove-duplicate-characters-from-String-Java.html#ixzz4lDmgbgiG
	private static void removeDuplicate2(char[] str) {
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;
		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len; j++) {
				if (str[i] == str[j]) {

					System.out.println(j + "---" + i);
					str[j] = 0;
				}
			}
		}

		System.out.println(str);

	}

	public static String toUniqueString(char[] letters) {
		StringBuilder sb = new StringBuilder(letters.length);
		for (char c : letters) {
			if (c != 0) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	// Read more:
	// http://javarevisited.blogspot.com/2016/06/how-to-remove-duplicate-characters-from-String-Java.html#ixzz4lDn7c9jX

}
