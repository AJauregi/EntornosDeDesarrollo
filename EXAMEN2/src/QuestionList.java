import java.util.Vector;
import java.util.Random;


/**
 * 
 */

/**
 * @author Aitor Jauregi
 *
 */
public class QuestionList {

	private static Vector<Question> theQuestionList = new Vector <Question>(); 
	private static int number;
	
	public QuestionList(){
	
	}
	
	/**
	 * Add a question to the vector
	 * @param que
	 */
	public static String addQuestion (Question que){
		theQuestionList.add(que);
		return "Saved";
	}
	
	/**
	 * Detele a question from the vector
	 * @param num
	 */
	public static void deleteQuestion (int num){
		theQuestionList.remove(num - 1);
	}
	
	/**
	 * Show all the questions
	 * @return
	 */
	public static String showAllQuestion (){
		String questions;
		questions = "";
		for (int i = 0; i < theQuestionList.size(); i++){
			questions = questions + " " + theQuestionList.elementAt(i).getQuest();
		}
		return questions;
	}
	
	/**
	 * Show a random question
	 * @return
	 */
	public static String showRandomQuestion (){
		Random random = new Random();
		number = random.nextInt(theQuestionList.size());
		return theQuestionList.elementAt(number).getQuest();
	}
	
	/**
	 * Check the answer
	 * @param ans
	 * @return
	 */
	public static String checkAnswer (String ans){
		if (theQuestionList.elementAt(number).getAnsw().equals(ans)){
			return "Is Correct!!";
		}else{
			return "Is incorrect!! the answer is " + theQuestionList.elementAt(number).getAnsw();
		}
	}
}
