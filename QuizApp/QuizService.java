import java.util.Scanner;
class QuizService {
    Quiz[] quiz = new Quiz[4];
    //String[] answers = new String[4];
    String[] user_answers = new String[4];
    int score = 0;
    QuizService() {
        quiz[0] = new Quiz(1, "what is the size of Int ?", "2 bytes", "4 bytes", "8 bytes", "16 bytes", "4 bytes");
        quiz[1] = new Quiz(2, "what is the size of Char ?", "2 bytes", "4 bytes", "8 bytes", "16 bytes", "2 bytes");
        quiz[2] = new Quiz(3, "what is the size of Float ?", "2 bytes", "4 bytes", "8 bytes", "16 bytes", "4 bytes");
        quiz[3] = new Quiz(4, "what is the size of Long ?", "2 bytes", "4 bytes", "8 bytes", "16 bytes", "8 bytes");
    }
    int i = 0;
    public void playQuiz(){
        Scanner sc = new Scanner(System.in);
        for(Quiz q : quiz){
            System.out.println(q.toString());
            System.out.println("eneter your answer :");
            String ans = sc.nextLine();
            user_answers[i++] = ans;
        }
        sc.close();
    }
    public void scoreCalucaltor(){
        for(i=0;i<4;i++){
            if(quiz[i].getAns().equals(user_answers[i])){
                score++;
            }
            else continue;
        }
        System.out.println("Your Score is : " + score);
    }
}
