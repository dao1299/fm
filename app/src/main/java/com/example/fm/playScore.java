package com.example.fm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class playScore extends AppCompatActivity {
    private Button btn1;
    private TextView txt1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
        btn1 = findViewById(R.id.btnClick);
        txt1=findViewById(R.id.txtScore);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreInt;
                String scoreString=txt1.getText().toString();
                System.out.println(scoreString);
                scoreInt=Integer.parseInt(scoreString)+1;
                scoreString=String.valueOf(scoreInt);
                txt1.setText(scoreString);
            }
        });
    }
}
