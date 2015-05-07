import java.util.Scanner;





/**
 * 
 */

/**
 * @author Aitor Jauregi
 *Show a menu
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String option, question, answer, number, stuAns;
		stuAns = "";

		Scanner reader = new Scanner(System.in);
		QuestionList test = new QuestionList();
		
		do{
		System.out.println("Choose an option:");
		System.out.println("1. Add a question.");
		System.out.println("2. Delete a question.");
		System.out.println("3. Show all the questions.");
		System.out.println("4. Show a random question.");
		System.out.println("5. Check the answer.");
		System.out.println("6. Exit.");
		option = reader.nextLine();
		
		switch (Integer.parseInt(option)){
		case 1:
			Question oneQuestion = new Question();
			
			System.out.println("Enter the question:");
			question = reader.nextLine();
			oneQuestion.setQuest(question);
			
			System.out.println("Enter the answer:");
			answer = reader.nextLine();
			oneQuestion.setAnsw(answer);
			
			System.out.println(QuestionList.addQuestion(oneQuestion));
			
		break;
		
		
		
		case 2:
			System.out.println("Enter the number of the question to delte it:");
			number = reader.nextLine();
			QuestionList.deleteQuestion(Integer.parseInt(number));
		break;
		
		case 3:
			System.out.println(QuestionList.showAllQuestion());
		break;
		
		case 4:
			System.out.println(QuestionList.showRandomQuestion());
			System.out.println("Insert the answer to the question: ");
			stuAns = reader.nextLine();
		break;
		
		case 5:
			System.out.println(QuestionList.checkAnswer(stuAns));
		break;
		
		case 6:
			System.out.println("Goodbye!");
			break;
		
		default:
			System.out.println("Incorrect option.");
		break;
		}
		}while (Integer.parseInt(option) != 6);
	}

}