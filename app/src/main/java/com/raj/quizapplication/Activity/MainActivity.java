package com.raj.quizapplication.Activity;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.raj.quizapplication.ModelClass.QuestionClass;
import com.raj.quizapplication.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //set controls
    TextView tvQueConter, tvTimer, tvQue;

    Button btOpt1, btOpt2, btOpt3, btOpt4;

    //list for que
    ArrayList<QuestionClass> queList = new ArrayList<>();

    int conter = 0;

    CountDownTimer tm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find view by ids
        tvQue = findViewById(R.id.tvQue);
        tvQueConter = findViewById(R.id.tvQueConter);
        tvTimer = findViewById(R.id.tvTimer);

        btOpt1 = findViewById(R.id.btOpt1);
        btOpt2 = findViewById(R.id.btOpt2);
        btOpt3 = findViewById(R.id.btOpt3);
        btOpt4 = findViewById(R.id.btOpt4);

        //load data
        queList.add(new QuestionClass("This is dummy Que 1", "ans 1", "ans 2",
                "ans 3", "ans 4", "ans 1"));
        queList.add(new QuestionClass("This is dummy Que 2", "ans 1", "ans 2",
                "ans 3", "ans 4", "ans 2"));
        queList.add(new QuestionClass("This is dummy Que 3", "ans 1", "ans 2",
                "ans 3", "ans 4", "ans 3"));
        //init conter
        conter = 0;

        //load ques and ans
        loadQuetions(conter);

        tvTimer.setText("12");
        //countdown time
        tm = new CountDownTimer(12 * 1000, 1000) {


            @Override
            public void onTick(long millisUntilFinished) {
                tvTimer.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {

                Toast.makeText(MainActivity.this, "Quiz Over", Toast.LENGTH_SHORT).show();
            }
        };


    }

    public void loadQuetions(int n) {

        final QuestionClass q = queList.get(n);

        tvQueConter.setText((n + 1) + "/" + queList.size());

        tvTimer.setText("" + 12);
        if (tm != null) {
            tm.start();
        }

        tvQue.setText("#" + (n + 1) + " " + q.getQue());
        btOpt1.setText("" + q.getOpt1());
        btOpt2.setText("" + q.getOpt2());
        btOpt3.setText("" + q.getOpt3());
        btOpt4.setText("" + q.getOpt4());

        btOpt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btOpt1.getText().equals(q.getRightOpt())) {
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    if (conter < (queList.size() - 1)) {
                        tm.cancel();
                        conter++;
                        loadQuetions(conter);
                    } else {
                        Toast.makeText(MainActivity.this, "All Que Completed!", Toast.LENGTH_SHORT).show();
                    }


                } else {
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }


            }
        });

        //btn2
        btOpt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btOpt2.getText().equals(q.getRightOpt())) {

                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    if (conter < (queList.size() - 1)) {
                        tm.cancel();
                        conter++;
                        loadQuetions(conter);
                    } else {
                        Toast.makeText(MainActivity.this, "All Que Completed!", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //btn 3
        btOpt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btOpt3.getText().equals(q.getRightOpt())) {

                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    if (conter < (queList.size() - 1)) {
                        tm.cancel();
                        conter++;
                        loadQuetions(conter);
                    } else {
                        Toast.makeText(MainActivity.this, "All Que Completed!", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //btn4
        btOpt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btOpt4.getText().equals(q.getRightOpt())) {

                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    if (conter < (queList.size() - 1)) {
                        tm.cancel();
                        conter++;
                        loadQuetions(conter);
                    } else {
                        Toast.makeText(MainActivity.this, "All Que Completed!", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}






