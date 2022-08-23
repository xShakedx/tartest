package t6;
import model.*;
import java.util.ArrayList;

public class T6 {

	public static void main(String[] args) {

		// 1
		Question q1 = new Question(1, "Q1", true);
		// 2
		Question q2 = new Question(2, "Q2", false);
		// 3
		OpenQuestion q3 = new OpenQuestion(3, "Q3", true, true);
		// 4
		OpenQuestion q4 = new OpenQuestion(q3);
		q4.setMandatory(false);

		// 5
		ClosedQuestion q5 = new ClosedQuestion(5, "Q5", true, true);
		q5.addOption("Op1", false);
		q5.addOption("Op2", true);
		q5.addOption("Op3", false);
		ArrayList<String> a5 = new ArrayList<String>();
		a5.add("Op1");
		boolean r5 = q5.checkReply(a5);

		// 6
		ClosedQuestion q6 = new ClosedQuestion(q5);
		q6.setSingleOption(false);
		q6.addOption("Op4", true);
		ArrayList<String> a6 = new ArrayList<String>();
		a6.add("Op2");
		a6.add("Op4");
		boolean r6 = q6.checkReply(a6);

		System.out.println("Q5 check reply result is : " + r5);
		System.out.println("Q6 check reply result is : " + r6);

		Question q16 = new Question(1,"Write your fav country's name",false);
		System.out.println(q16);
		OpenQuestion q26 = new OpenQuestion(2, "Write about your last vacation: ",true, false);
		System.out.println(q26);
		ClosedQuestion q36 = new ClosedQuestion(36, "Mark european capital cities", false, false);
		q36.addOption("Jerusalem", false);
		q36.addOption("Barca", false);
		q36.addOption("Paris", true);
		q36.addOption("Madrid", true);
		System.out.println(q36);
		Question[] questions = new Question[3];
		questions[0] = q16;
		questions[1] = q26;
		questions[2] = q36;

		for (Question question:questions)
		{
			System.out.println(questions);
		}
	}

}