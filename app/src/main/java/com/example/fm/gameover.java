package com.example.fm;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class gameover extends AppCompatActivity {
    private TextView txtScoreGameOver;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
        final Intent intent = getIntent();
        txtScoreGameOver = findViewById(R.id.txtScoreGameOver);
        String temp=intent.getStringExtra("KEY_SCORE");
        Toast.makeText(this,temp,Toast.LENGTH_SHORT).show();
        txtScoreGameOver.setText(temp);
    }
}
