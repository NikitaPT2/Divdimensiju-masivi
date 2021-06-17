import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		int x = 0;
		int score = 0;
		String correct = "You are correct";
	    String incorrect = "You are incorrect";
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
	    
	    for(x = 0; x < 10; x++)
	    {
	    	JOptionPane.showMessageDialog(null, quizQuestion[x]);
	    	switch(x) {
	    	case 0:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = modernākajām, B = mirušajām, C = vecajām, D = progresīvākajām");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("AD"))
            {
                JOptionPane.showMessageDialog(null, correct);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect);
            }
            break;
            
	    	case 1:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = faili, B = masīvi, C = struktūras, D = metodes");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("ABC"))
            {
                JOptionPane.showMessageDialog(null, correct);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect);
            }
            break;
	            
	    	case 2:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = int [] birthdays = new int[10]; B = int birthdays [] = String[10]; C = String birthdays [] = new String[10]; D = int birthdays = new int[10];");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("AC"))
            {
                JOptionPane.showMessageDialog(null, correct);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect);
            }
            break;
	            
	    	case 3:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = klasēm, B = rindām, C = kolonām, D = metodēm");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("BC"))
            {
                JOptionPane.showMessageDialog(null, correct);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect);
            }
            break;
            
	    	case 4:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = String [][] vardi = String [3][4]; B = int vecums [][] = new int [3][4]; C = int vecums [] = new int [3][4]; D = String [][] vardi = new String [3][4];");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("BD"))
            {
                JOptionPane.showMessageDialog(null, correct);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect);
            }
            break;
            
	    	case 5:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = int [][] vecums = {5,7,3,17},{7,0,1,12}; B = int [][] vecums = {{5,7,3,17},{7,0,1,12}}; C = int [][] vecums = new int {{5,7,3,17},{7,0,1,12}}; D = masivs[0][0] = 5;");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("BD"))
            {
                JOptionPane.showMessageDialog(null, correct);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect);
            }
            break;
            
	    	case 6:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = izmantojot Arrays.deepToString() metodi, B = izmantojot System.out.println(), C = izmantojot divus for ciklus, D = izmantojot Arrays.toString() metodi");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("AC"))
            {
                JOptionPane.showMessageDialog(null, correct);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect);
            }
            break;
	            
	    	case 7:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = pārvērtot to par viendimensiju masīvu un pielietot Arrays.sort() metodi, B = izmantojot deepArrays.sort() metodi, C = izmantojot Arrays.sort() metodi, "
	    			+ "D = pārvērtot to par viendimensiju masīvu un pielietot kādu kārtošanas algoritmu");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("AD"))
            {
                JOptionPane.showMessageDialog(null, correct);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect);
            }
            break;
	            
	    	case 8:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = deepEquals(); B = copyOf(); C = toString(); D = deepToString();");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("AD"))
            {
                JOptionPane.showMessageDialog(null, correct);
                score++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, incorrect);
            }
            break;
	            
	    	case 9:
	    	playerAnswerString = JOptionPane.showInputDialog(null, "A = vajag būt [][], B = nevajag new int, C = masīvs nevar būt ar dažādu elementu skaitu vienā rindā, D = lieki {}");

            System.out.println(playerAnswerString+"   "+playerAnswer);

            if(playerAnswerString.equals("AB"))
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
	    JOptionPane.showMessageDialog(null, "You scored " + score + "/10.");
	    }
}