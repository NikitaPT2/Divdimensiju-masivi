import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		int x = 0;
		int score = 0;
		String correct = "You are correct";
	    String incorrect = "You are incorrect";
	    String playerAnswerString = " ";
	    String[] quizQuestion = {"Valoda Java ir viena no ... valodām"};
	    playerAnswerString.toUpperCase();
	    char playerAnswer = playerAnswerString.charAt(0);
	    JOptionPane.showMessageDialog(null, "Pārbaudi savas zināšanas!");
	    JOptionPane.showMessageDialog(null, "Izvēlieties 2 vai 3 atbildes uz jautājumu (rakstiet atbildes bez atstarpes, piemēram, ABC)");
	    
	    for(x = 0; x < 10; x++)
	    {
	    	JOptionPane.showMessageDialog(null, quizQuestion[x]);
	    	switch(x) {
	    	case 0:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = Blue, B = Green, C = Brown");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("A"))
            {
                JOptionPane.showMessageDialog(null, correct);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect);
            }
            break;
	    	}
	   
	        }
	    }
	  
	}
	
}
