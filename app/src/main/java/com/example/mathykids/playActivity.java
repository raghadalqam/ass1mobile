package com.example.mathykids;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import java.util.Random;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class playActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView questionTextView, resultTextView;
    private Button option1Button;
    private Button option2Button;
    private Button option3Button;
    private Button option4Button;
    private String operation;
    private int operand1, operand2, answer, correctOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        questionTextView = findViewById(R.id.question_textview);
        resultTextView = findViewById(R.id.result_textview);
        option1Button = findViewById(R.id.option1button);
        option2Button = findViewById(R.id.option2button);
        option3Button = findViewById(R.id.option3button);
        option4Button = findViewById(R.id.option4button);

        operation = getIntent().getStringExtra("operation");

        generateQuestion();

        option1Button.setOnClickListener(this);
        option2Button.setOnClickListener(this);
        option3Button.setOnClickListener(this);
        option4Button.setOnClickListener(this);
    }

    private void generateQuestion() {
        Random random = new Random();
        operand1 = random.nextInt(10) + 1;
        operand2 = random.nextInt(10) + 1;

        switch (operation) {
            case "+":
                answer = operand1 + operand2;
                break;
            case "-":
                answer = operand1 - operand2;
                break;
            case "*":
                answer = operand1 * operand2;
                break;
            case "/":
                operand1 = answer * operand2;
                break;
        }

        correctOption = random.nextInt(4) + 1;

        switch (correctOption) {
            case 1:
                option1Button.setText(String.valueOf(answer));
                option2Button.setText(String.valueOf(random.nextInt(20) + 1));
                option3Button.setText(String.valueOf(random.nextInt(20) + 1));
                option4Button.setText(String.valueOf(random.nextInt(20) + 1));
                break;
            case 2:
                option1Button.setText(String.valueOf(random.nextInt(20) + 1));
                option2Button.setText(String.valueOf(answer));
                option3Button.setText(String.valueOf(random.nextInt(20) + 1));
                option4Button.setText(String.valueOf(random.nextInt(20) + 1));
                break;
            case 3:
                option1Button.setText(String.valueOf(random.nextInt(20) + 1));
                option2Button.setText(String.valueOf(random.nextInt(20) + 1));
                option3Button.setText(String.valueOf(answer));
                option4Button.setText(String.valueOf(random.nextInt(20) + 1));
                break;
            case 4:
                option1Button.setText(String.valueOf(random.nextInt(20) + 1));
                option2Button.setText(String.valueOf(random.nextInt(20) + 1));
                option3Button.setText(String.valueOf(random.nextInt(20) + 1));
                option4Button.setText(String.valueOf(answer));
                break;
        }

        questionTextView.setText(String.format("%d %s %d = ?", operand1, operation, operand2));
        resultTextView.setText("");
    }

    @Override
    public void onClick(View v) {
        int selectedOption;

        switch (v.getId()) {
            case  R.id.option1Button:

                // Handle option 1 button click
                break;
            case R.id.option2Button:
                // Handle option 2 button click
                break;
            case R.id.option3Button:
                // Handle option 3 button click
                break;
            case R.id.option4Button:
                // Handle option 4 button click
                break;
        }


        if (selectedOption == correctOption) {
            resultTextView.setText("Correct!");
        }
    }
}