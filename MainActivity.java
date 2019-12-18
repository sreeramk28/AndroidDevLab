package com.example.understandinggui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView tv1;
    Button b1;
    String nam, dept, sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.name);
        e2 = findViewById(R.id.dept);
        tv1 = findViewById(R.id.result);
        b1 = findViewById(R.id.button2);
        //tv2 = findViewById(R.id.dept);

        //tv1.setText(sm);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                nam = e1.getEditableText().toString();
                dept = e2.getEditableText().toString();
                sm = nam + "-" + dept;
                tv1.setText(sm);
            }
        });
    }
}
