package com.example.zakat_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView r;
    EditText e, e2, e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = findViewById(R.id.edit);
        e2 = findViewById(R.id.edit2);
        e3 = findViewById(R.id.goods);
        r = findViewById(R.id.result);
        b1 = findViewById(R.id.cal);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e.getText().toString().equals("") || e2.getText().toString().equals("") || e3.getText().toString().equals("")) {
                    r.setText("All fields must be filled");
                } else {
                    double num1 = Double.parseDouble(e.getText().toString());
                    double num2 = Double.parseDouble(e2.getText().toString());
                    double num3 = Double.parseDouble(e3.getText().toString());
                    if (num1 + num2 + num3 < 1640250) {
                        r.setText("Zakat is:  0Rs");
                    } else {
                        double total = num1 + num2 + num3;
                        double ans = (total * 2.5) / 100;
                        r.setText("Zakat is: " + ans + "Rs");
                    }

                }
            }
        });

    }
}