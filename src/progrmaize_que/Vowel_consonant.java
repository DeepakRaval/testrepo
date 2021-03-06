package progrmaize_que;
// checking weather the  alphabet consonant or vowel
// vowel = a e i o u
//  consonant = all the remaining alphabets
public class Vowel_consonant {

	public static void main(String[] args) {
		char ch = 'a';
		if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
			System.out.println(ch + " is Vowel " );
		}else{
			System.out.println(ch + " is Consonant " );
		}
}
}