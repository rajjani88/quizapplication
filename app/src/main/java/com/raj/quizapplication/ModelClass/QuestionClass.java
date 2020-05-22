package com.raj.quizapplication.ModelClass;

/*
* class for question and ans
*
* */
public class QuestionClass {

    String que;
    String opt1, opt2, opt3, opt4;
    String rightOpt;

    //constructor


    public QuestionClass(String que, String opt1, String opt2, String opt3, String opt4, String rightOpt) {
        this.que = que;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.rightOpt = rightOpt;
    }

    //get and set

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getRightOpt() {
        return rightOpt;
    }

    public void setRightOpt(String rightOpt) {
        this.rightOpt = rightOpt;
    }
}
