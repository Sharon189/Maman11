
public class DatabaseWords {
	
	private String[] words = { "excellent", "Great" };
	
	public String getRandomWord() {
		int randomWordNumber = (int) (Math.random() * words.length);
		// Random wrand = new Random();
		// index = wrand.nextInt(wordlen());
		System.out.println("\nThe words array index is:" + randomWordNumber);
		return words[randomWordNumber];
	}
}