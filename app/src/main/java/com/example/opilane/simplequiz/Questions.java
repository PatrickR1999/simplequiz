package com.example.opilane.simplequiz;


public class Questions {
    public String MyQuestions[] = {
        "1 + 1 = ?",
        "2 + 2 = ?",
        "3 + 3 = ?",
        "4 + 4 = ?",
        "5 + 5 = ?",
        "6 + 6 = ?",
        "7 + 7 = ?"

    };

    public String MyChoices [] [] ={
            {"2","1","0","11"},
            {"1","22","3","4"},
            {"0","33","9","6"},
            {"8","88","16","5"},
            {"55","10","113","545"},
            {"12","5","2","3"},
            {"1","2","3","14"}


    };

    public String MyCorrectAnswers [] = {
            "1","4","6","8","10","12","14"
    };

    public int getLength() {return MyQuestions.length;}

    public String getQuestions(int a) {
        String question = MyQuestions[a];
        return question;
    }

    public String getChoice(int index, int num){
        String choice0=MyChoices[index][num -1];
        return choice0;
    }

    public String getCorrectAnswer (int a){
        String answer = MyCorrectAnswers[a];
        return answer;
    }
}
