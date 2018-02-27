package javapractice;

public class ReplaceChar {

	private String word;

	public ReplaceChar(String word) {
		this.word = word;
	}

	//replace letters in string 
	public String replace(String oldLetter, String newLetter) {
		return word.replace(oldLetter, newLetter);

	}
//replace letter in string based on location
	public String replaceIndex(int i, String letter) {
		return word.substring(0, i) + letter + word.substring(i + 1);
	}

}
