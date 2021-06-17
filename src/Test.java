import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Test {

	public static void main(String[] args) {
		int x = 0;
		int score = 0;
		String correct = "Pareizi";
	    String incorrect = "Nepareizi";
	    String playerAnswerString = " ";
	    String[] quizQuestion = {"Valoda Java ir viena no ... valodām","Kas pieder pie strukturētajiem mainīgajiem?",
	    		"Java viendimensiju masīvu var definēt sekojoši:","Divdimensiju masīvs sastāv no ...","Java 2d masīvu var definēt sekojoši:",
	    		"Kadu kodu vajag izmantot, lai ievietot vērtības 2d masīva šūnās","Divdimensiju masīva izvade","Kā kārtot divdimensiju masīvu?",
	    		"Kādas Arrays metodes var piemērot divdimensiju masīvam?",
	    		"Kādas kļūdas ir šajā masīvā? int[] myArray = new int {{18,28},{28,45,90},{45,3,14}};"};
	    playerAnswerString.toUpperCase();
	    char playerAnswer = playerAnswerString.charAt(0);
	    JOptionPane.showMessageDialog(null, "Pārbaudi savas zināšanas!");
	    JOptionPane.showMessageDialog(null, "Izvēlieties 2 vai 3 atbildes uz jautājumu (rakstiet atbildes bez atstarpes, piemēram, ABC)");
	    UIManager.put("OptionPane.cancelButtonText", "Apturēt");
	    
	    for(x = 0; x < 10; x++)
	    {
	    	JOptionPane.showMessageDialog(null, quizQuestion[x],"????",JOptionPane.QUESTION_MESSAGE);
	    	switch(x) {
	    	case 0:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = modernākajām, B = mirušajām, C = vecajām, D = progresīvākajām", "Valoda Java ir viena no ... valodām", JOptionPane.QUESTION_MESSAGE);

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.toUpperCase().equals("AD"))
            {
                JOptionPane.showMessageDialog(null, correct, ":)",JOptionPane.INFORMATION_MESSAGE);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect, ":(",JOptionPane.ERROR_MESSAGE);
            }
            break;
            
	    	case 1:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = faili, B = masīvi, C = struktūras, D = metodes","Kas pieder pie strukturētajiem mainīgajiem?", JOptionPane.QUESTION_MESSAGE );

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.toUpperCase().equals("ABC"))
            {
            	JOptionPane.showMessageDialog(null, correct, ":)",JOptionPane.INFORMATION_MESSAGE);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect, ":(",JOptionPane.ERROR_MESSAGE);
            }
            break;
	            
	    	case 2:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = int [] birthdays = new int[10]; B = int birthdays [] = String[10]; "
	    			+ "C = String birthdays [] = new String[10]; D = int birthdays = new int[10];","Java viendimensiju masīvu var definēt sekojoši:", JOptionPane.QUESTION_MESSAGE);

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.toUpperCase().equals("AC"))
            {
            	JOptionPane.showMessageDialog(null, correct, ":)",JOptionPane.INFORMATION_MESSAGE);
                score++;
            }
            else
            {
            	JOptionPane.showMessageDialog(null, incorrect, ":(",JOptionPane.ERROR_MESSAGE);
            }
            break;
	            
	    	case 3:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = klasēm, B = rindām, C = kolonām, D = metodēm","Divdimensiju masīvs sastāv no ...", JOptionPane.QUESTION_MESSAGE);

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.toUpperCase().equals("BC"))
            {
            	JOptionPane.showMessageDialog(null, correct, ":)",JOptionPane.INFORMATION_MESSAGE);
                score++;
            }
            else
            {
            	JOptionPane.showMessageDialog(null, incorrect, ":(",JOptionPane.ERROR_MESSAGE);
            }
            break;
            
	    	case 4:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = String [][] vardi = String [3][4]; B = int vecums [][] = new int [3][4];"
	    			+ " C = int vecums [] = new int [3][4]; D = String [][] vardi = new String [3][4];","Java 2d masīvu var definēt sekojoši:", JOptionPane.QUESTION_MESSAGE);

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.toUpperCase().equals("BD"))
            {
            	JOptionPane.showMessageDialog(null, correct, ":)",JOptionPane.INFORMATION_MESSAGE);
                score++;
            }
            else
            {
            	JOptionPane.showMessageDialog(null, incorrect, ":(",JOptionPane.ERROR_MESSAGE);
            }
            break;
            
	    	case 5:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = int [][] vecums = {5,7,3,17},{7,0,1,12}; "
	    			+ "B = int [][] vecums = {{5,7,3,17},{7,0,1,12}}; C = int [][] vecums = new int {{5,7,3,17},{7,0,1,12}}; D = masivs[0][0] = 5;","Lai ievietot vērtības 2d masīva šūnās, Jūs varāt izmantot šadu kodu", JOptionPane.QUESTION_MESSAGE);

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.toUpperCase().equals("BD"))
            {
            	JOptionPane.showMessageDialog(null, correct, ":)",JOptionPane.INFORMATION_MESSAGE);
                score++;
            }
            else
            {
            	JOptionPane.showMessageDialog(null, incorrect, ":(",JOptionPane.ERROR_MESSAGE);
            }
            break;
            
	    	case 6:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = izmantojot Arrays.deepToString() metodi, B = izmantojot System.out.println(), "
	    			+ "C = izmantojot divus for ciklus, D = izmantojot Arrays.toString() metodi","Divdimensiju masīva izvade", JOptionPane.QUESTION_MESSAGE);

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.toUpperCase().equals("AC"))
            {
            	JOptionPane.showMessageDialog(null, correct, ":)",JOptionPane.INFORMATION_MESSAGE);
                score++;
            }
            else
            {
            	JOptionPane.showMessageDialog(null, incorrect, ":(",JOptionPane.ERROR_MESSAGE);
            }
            break;
	            
	    	case 7:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = pārvērtot to par viendimensiju masīvu un pielietot Arrays.sort() metodi, B = izmantojot deepArrays.sort() metodi, C = izmantojot Arrays.sort() metodi, "
	    			+ "D = pārvērtot to par viendimensiju masīvu un pielietot kādu kārtošanas algoritmu","Kā kārtot divdimensiju masīvu?", JOptionPane.QUESTION_MESSAGE);

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.toUpperCase().equals("AD"))
            {
            	JOptionPane.showMessageDialog(null, correct, ":)",JOptionPane.INFORMATION_MESSAGE);
                score++;
            }
            else
            {
            	JOptionPane.showMessageDialog(null, incorrect, ":(",JOptionPane.ERROR_MESSAGE);
            }
            break;
	            
	    	case 8:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = deepEquals(); B = copyOf(); C = toString(); D = deepToString();","Kādas Arrays metodes var piemērot divdimensiju masīvam?", JOptionPane.QUESTION_MESSAGE);

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.toUpperCase().equals("AD"))
            {
            	JOptionPane.showMessageDialog(null, correct, ":)",JOptionPane.INFORMATION_MESSAGE);
                score++;
            }
            else
            {
            	JOptionPane.showMessageDialog(null, incorrect, ":(",JOptionPane.ERROR_MESSAGE);
            }
            break;
	            
	    	case 9:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = vajag būt [][], B = nevajag new int, C = masīvs nevar būt ar dažādu elementu skaitu vienā rindā, D = lieki {}","Kā kārtot divdimensiju masīvu?", JOptionPane.QUESTION_MESSAGE);

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.toUpperCase().equals("AB"))
            {
            	JOptionPane.showMessageDialog(null, correct, ":)",JOptionPane.INFORMATION_MESSAGE);
                score++;
            }
            else
            {
            	JOptionPane.showMessageDialog(null, incorrect, ":(",JOptionPane.ERROR_MESSAGE);
            }
            break;
	    	}
	        }
	    JOptionPane.showMessageDialog(null, "Jūs atbildējāt pareizi uz " + score + "/10 jautājumiem");
	    }
}