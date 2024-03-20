class QuizRunner {
    public static void main(String[] args) {
        QuizService service = new QuizService();
        System.out.println("Lets Play the quiz ");
        service.playQuiz();
        System.out.println("Lets See Your Score ");
        service.scoreCalucaltor();
        System.out.println("Thank you");
    }
        
}