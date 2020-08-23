package com.example.fm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class playmain extends AppCompatActivity {
    private TextView txtScore;
    private TextView txtRandom1;
    private TextView txtRandom2;
    private TextView txtRandomKQ;
    private ImageButton btnTrue;
    private ImageButton btnFalse;
    private int a,b,c;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_fm);
        txtScore = findViewById(R.id.txtScore);
        txtRandom1 = findViewById(R.id.txtR1);
        txtRandom2 = findViewById(R.id.txtR2);
        txtRandomKQ = findViewById(R.id.txtR3);
        btnFalse = findViewById(R.id.btnsai);
        btnTrue = findViewById(R.id.btndung);

        Random random = new Random();
        a=random.nextInt(10)+1;
        b=random.nextInt(10)+1;
        c=a+b+random.nextInt(5)-2;
        String txt;
        txt=String.valueOf(a);
        txtRandom1.setText(txt);
        txt=String.valueOf(b);
        txtRandom2.setText(txt);
        txt=String.valueOf(c);
        txtRandomKQ.setText(txt);
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a+b==c) {
                    int scoreInt;
                    String scoreString=txtScore.getText().toString();
                    System.out.println(scoreString);
                    scoreInt=Integer.parseInt(scoreString)+1;
                    scoreString=String.valueOf(scoreInt);
                    txtScore.setText(scoreString);
                    tieptuc();
                }
                else {
                    Intent intent = new Intent(playmain.this,gameover.class);
                    startActivity(intent);
                }
            }
        });
        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a+b!=c) {
                    int scoreInt;
                    String scoreString=txtScore.getText().toString();
                    System.out.println(scoreString);
                    scoreInt=Integer.parseInt(scoreString)+1;
                    scoreString=String.valueOf(scoreInt);
                    txtScore.setText(scoreString);
                    tieptuc();
                }
                else {
                    String scoreString=txtScore.getText().toString();
                    Intent intent = new Intent(playmain.this,gameover.class);
                    intent.putExtra("KEY_SCORE",scoreString);
                    startActivity(intent);
                }
            }
        });

    }
    protected void tieptuc (){
        Random random = new Random();
        a=random.nextInt(10)+1;
        b=random.nextInt(10)+1;
        c=a+b+random.nextInt(5)-2;
        String txt;
        txt=String.valueOf(a);
        txtRandom1.setText(txt);
        txt=String.valueOf(b);
        txtRandom2.setText(txt);
        txt=String.valueOf(c);
        txtRandomKQ.setText(txt);
    }
}
