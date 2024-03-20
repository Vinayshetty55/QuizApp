class Quiz {
    private int qId;
    private String quetion = "";
    private String option1 = "";
    private String option2 = "";
    private String option3 = "";
    private String option4 = "";
    private String ans = "";
    
    public Quiz(int qId, String quetion, String option1, String option2, String option3, String option4, String ans) {
        this.qId = qId;
        this.quetion = quetion;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.ans = ans;
    }
    
    public int getqId() {
        return qId;
    }
    public void setqId(int qId) {
        this.qId = qId;
    }
    public String getQuetion() {
        return quetion;
    }
    public void setQuetion(String quetion) {
        this.quetion = quetion;
    }
    public String getOption1() {
        return option1;
    }
    public void setOption1(String option1) {
        this.option1 = option1;
    }
    public String getOption2() {
        return option2;
    }
    public void setOption2(String option2) {
        this.option2 = option2;
    }
    public String getOption3() {
        return option3;
    }
    public void setOption3(String option3) {
        this.option3 = option3;
    }
    public String getOption4() {
        return option4;
    }
    public void setOption4(String option4) {
        this.option4 = option4;
    }
    public String getAns() {
        return ans;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return  qId +". " + quetion + " 1."+ option1 + " 2." + option2
                + " 3." + option3 + " 4." + option4 ;
    }

}