package com.example.mathykids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnSubtract, btnMultiply, btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get references to the operation buttons
        btnAdd = findViewById(R.id.add_button);
        btnSubtract = findViewById(R.id.sub_button);
        btnMultiply = findViewById(R.id.mul_button);
        btnDivide = findViewById(R.id.div_button);

        // set onClickListeners for each operation button
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPlayActivity("add");
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPlayActivity("subtract");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPlayActivity("multiply");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPlayActivity("divide");
            }
        });
    }

    private void startPlayActivity(String operation) {
        Intent intent = new Intent(MainActivity.this, PlayActivity.class);
        intent.putExtra("operation", operation);
        startActivity(intent);
    }
}
