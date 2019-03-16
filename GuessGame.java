import javax.swing.JOptionPane;

public class GuessGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For programmer Debug , view the word that PC chosen.
		DatabaseWords dataBaseWord = new DatabaseWords();
		String chosenWord = dataBaseWord.getRandomWord();
		System.out.println("The pc choose the word:" + chosenWord);

		WordHandler wordHandler = new WordHandler(chosenWord);

		String dashString = wordHandler.getAsDashes();
		System.out.println("Dashes: " + dashString);
		
		StringBuilder charRegex = new StringBuilder();
		String input;
		int triesCount = -1;
		do {
			
			do {
				input = JOptionPane.showInputDialog("Guess the letter in the word: " + dashString);
				triesCount++;
			} while (input.length() == 1 && !wordHandler.contains(input.charAt(0)));

			charRegex.append(input);
			dashString = chosenWord.replaceAll("[^" + charRegex.toString() + "]", "-");
			System.out.println("Dashes: " + dashString);
			triesCount++;
		} while(dashString.contains("-"));
		
		
		JOptionPane.showMessageDialog(null, "\nThe word is " + chosenWord + " You try:"+ triesCount  + " time(s)"); 
		
	}


}
