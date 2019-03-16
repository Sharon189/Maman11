public class WordHandler {

	
	private String word;
	
	public WordHandler(String word) {
		this.word = word;
	}
	
	/**
	 * @return the given world as dashes: e.g "----"
	 */
	public String getAsDashes() {
		return word.replaceAll(".", "-");
	}
	
	/* Check if the given word contains the letter */
	public boolean contains(char letter) {
		return word.contains(String.valueOf(letter));
	}

}
