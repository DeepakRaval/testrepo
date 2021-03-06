package demo;

public class OccuranceOfElement {

	public static void main(String[] args) {
		String test = "deepakraval";
		occuranceOfElement(test);

	}

	static void occuranceOfElement(String test) {
		int lenght = test.length();
		char[] charArray = test.toCharArray();

			for (int i = 0; i < lenght - 1; i++) {
			int n = 1;
			if(charArray[i]==charArray[i+1]){
				continue;
			}

			for (int j = i + 1; j < lenght; j++) {

				if (charArray[i] == charArray[j]) {
					n++;
				}
			}
			System.out.println(charArray[i] + "=" + n);
		}

	}
}
