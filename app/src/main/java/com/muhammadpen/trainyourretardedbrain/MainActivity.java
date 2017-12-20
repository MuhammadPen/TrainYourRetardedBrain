package com.muhammadpen.trainyourretardedbrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button startButton;
    TextView questionTextView;
    ArrayList<Integer> answers;
    int correctAnswerLocation;

    public void startButtonPress (View view) {
        startButton.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomNumber = new Random();
        int a = randomNumber.nextInt(13);
        int b = randomNumber.nextInt(13);
        correctAnswerLocation = randomNumber.nextInt(4);

        int incorrectAnswer;

        for (int i=0 ; i<4 ; i++){
            if (i == correctAnswerLocation){

                answers.add(a + b);

            }else {

                incorrectAnswer = randomNumber.nextInt(200);

                while (incorrectAnswer == a+b){
                    incorrectAnswer = randomNumber.nextInt(200);
                }
                answers.add(incorrectAnswer);

            }
        }

        

        questionTextView.setText(Integer.toString(a) + "+" + Integer.toString(b));

         startButton = (Button) findViewById(R.id.startButton);
         questionTextView = (TextView) findViewById(R.id.questionTextView);
    }
}
