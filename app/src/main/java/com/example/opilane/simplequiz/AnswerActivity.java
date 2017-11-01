package com.example.opilane.simplequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class AnswerActivity extends AppCompatActivity {

    private Questions MyQuestions = new Questions();
    private TextView vastused;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        vastused = (TextView) findViewById(R.id.vastusedJ2rjest);
        int arraySize = MyQuestions.MyCorrectAnswers.length;
        for (int i = 0; i < arraySize; i++){
            vastused.append(i+1 + ". " + MyQuestions.MyCorrectAnswers[i] + "\n");
        }
    }
}
