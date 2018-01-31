package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BavarianSights extends AppCompatActivity {

    int score = 0;
    int questionCounter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bavarian_sights);

    }


    public  void button1(View view){
        questionCounter += 1;

        if (questionCounter == 1) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();


            display2();

        }


        if (questionCounter == 2) {
            Toast.makeText(this, "Right answer!! +1 Point", Toast.LENGTH_SHORT).show();
            score ++;
            displayScore(score);

            display3();


        }

        if (questionCounter == 3) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();

            display4();
        }

        if (questionCounter == 4) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();

            display5();
        }

        if (questionCounter == 5) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();
            congratsMessage();

        }
    }

    public  void button2(View view){
        questionCounter ++;
        if (questionCounter == 1) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();

            display2();
        }

        if (questionCounter == 2) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();

            display3();
        }

        if (questionCounter == 3) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();

            display4();
        }

        if (questionCounter == 4) {
            Toast.makeText(this, "Right answer!! +1 Point", Toast.LENGTH_SHORT).show();
           score ++;
           displayScore(score);


            display5();


        } if (questionCounter == 5) {
            Toast.makeText(this, "Right answer!! +1 Point", Toast.LENGTH_SHORT).show();
             score ++;
             congratsMessage();

        }

    }

    public  void button3(View view){
        questionCounter ++;

        if (questionCounter == 1) {
            Toast.makeText(this, "Right answer!! +1 Point", Toast.LENGTH_SHORT).show();
            score ++;

            display2();

        }

        if (questionCounter == 2) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();


            display3();
        }

        if (questionCounter == 3) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();

            display4();
        }
        if (questionCounter == 4) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();

            display5();
        }

        if (questionCounter == 5) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();
            congratsMessage();

        }


    }

    public  void button4(View view){

        questionCounter ++;

        if (questionCounter == 1) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();

            display2();
        }
        if (questionCounter == 2) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();


            display3();
        }

        if (questionCounter == 3) {
            Toast.makeText(this, "Right answer!! +1 Point", Toast.LENGTH_SHORT).show();
            score ++;

            display4();

        }

        if (questionCounter == 4) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();

            display5();
        }

        if (questionCounter == 5) {
            Toast.makeText(this, "Wrong! No Points", Toast.LENGTH_SHORT).show();
            congratsMessage();


        }
    }


    public void display2(){

        displayScore(score);

        TextView question2TextView = (TextView) findViewById(R.id.Questions);
        question2TextView.setText(R.string.sights_question_2);

        TextView question2Button1 = (TextView) findViewById(R.id.button_1);
        question2Button1.setText(R.string.answer_s_2_right);

        TextView question2Button2 = (TextView) findViewById(R.id.button_2);
        question2Button2.setText(R.string.answer_s_2_1);

        TextView question2Button3 = (TextView) findViewById(R.id.button_3);
        question2Button3.setText(R.string.answer_s_2_2);

        TextView question2Button4 = (TextView) findViewById(R.id.button_4);
        question2Button4.setText(R.string.answer_s_2_3);





    }

    public void display3(){

        displayScore(score);

        TextView question3TextView = (TextView) findViewById(R.id.Questions);
        question3TextView.setText(R.string.sights_question_3);

        TextView questionButton1 = (TextView) findViewById(R.id.button_1);
        questionButton1.setText(R.string.answer_s_3_1);

        TextView questionButton2 = (TextView) findViewById(R.id.button_2);
        questionButton2.setText(R.string.answer_s_3_3);

        TextView questionButton3 = (TextView) findViewById(R.id.button_3);
        questionButton3.setText(R.string.answer_s_3_2);

        TextView questionButton4 = (TextView) findViewById(R.id.button_4);
        questionButton4.setText(R.string.answer_s_3_right);

    }

    public void display4(){

        displayScore(score);

        TextView question4TextView = (TextView) findViewById(R.id.Questions);
        question4TextView.setText(R.string.sights_question_4);

        TextView questionButton1 = (TextView) findViewById(R.id.button_1);
        questionButton1.setText(R.string.answer_s_4_1);

        TextView questionButton2 = (TextView) findViewById(R.id.button_2);
        questionButton2.setText(R.string.answer_s_4_right);

        TextView questionButton3 = (TextView) findViewById(R.id.button_3);
        questionButton3.setText(R.string.answer_s_4_2);

        TextView questionButton4 = (TextView) findViewById(R.id.button_4);
        questionButton4.setText(R.string.answer_s_4_3);

    }

    public void display5(){

        displayScore(score);

        TextView questionTextView = (TextView) findViewById(R.id.Questions);
        questionTextView.setText(R.string.sights_question_5);

        TextView questionButton1 = (TextView) findViewById(R.id.button_1);
        questionButton1.setText(R.string.answer_s_5_1);

        TextView questionButton2 = (TextView) findViewById(R.id.button_2);
        questionButton2.setText(R.string.answer_s_5_right);

        TextView questionButton3 = (TextView) findViewById(R.id.button_3);
        questionButton3.setText(R.string.answer_s_5_2);

        TextView questionButton4 = (TextView) findViewById(R.id.button_4);
        questionButton4.setText(R.string.answer_s_5_3);

    }

    private void displayScore(int score) {
        String scoreMssg = " " + score;

        TextView scoreTextView = (TextView) findViewById(R.id.score_sights);
       scoreTextView.setText(scoreMssg);
    }

    private void congratsMessage(){
        TextView message = (TextView) findViewById(R.id.congrats_text);
        message.setText(R.string.congratulations_text);

    }



}
