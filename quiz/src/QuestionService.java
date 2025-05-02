import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class QuestionService {
    ArrayList<Question> questions = new ArrayList<Question>();
    ArrayList<String> selections = new ArrayList<String>();
    //arraylist has dynamic size, array does not
    public QuestionService() {

        questions.add(new Question(1, "Who is Mandela", new String[]{"South Africa", "United States", "Indonesia"}, "South Africa"));
        questions.add(new Question(2, "Who is Obama", new String[]{"South Africa", "United States", "Indonesia"}, "United States"));
        questions.add(new Question(3, "Who is Jokowi", new String[]{"South Africa", "United States", "Indonesia"}, "Indonesia"));
    }

    public void playQuiz() {

        for (Question q : this.questions) {
            System.out.println(q.id);
            System.out.println(q.question);
            for (String opt : q.options) {
                System.out.println(opt);
            }
            //get user input from console
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            selections.add(userInput);
        }



    }


    public void showScore() {
        int score = 0;
        for (int i = 0; i < this.selections.toArray().length; i++) {
            String userSelection = this.selections.get(i);
            if (userSelection.equalsIgnoreCase(this.questions.get(i).answer)) {
                score += 10;
            }
        }
        System.out.println("Your score is " + score);
    }

}
