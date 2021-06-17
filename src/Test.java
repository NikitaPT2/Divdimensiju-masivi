import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		int x = 0;
		int score = 0;
		String correct = "You are correct";
	    String incorrect = "You are incorrect";
	    String playerAnswerString = " ";
	    String[] quizQuestion = {"What is the color of the sky?", "What is the color of the sea?", "What is the color of the earth?"};
	    playerAnswerString.toUpperCase();
	    char playerAnswer = playerAnswerString.charAt(0);
	    JOptionPane.showMessageDialog(null, "Pārbaudi savas zināšanas!");
	    JOptionPane.showMessageDialog(null, "Izvēlieties 2 vai 3 atbildes uz jautājumu (rakstiet atbildes bez atstarpes, piemēram, ABC)");
	    
	    
	  
	}
	
}
