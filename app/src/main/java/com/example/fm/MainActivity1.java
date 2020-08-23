package com.example.fm;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {
    private static final String tag = MainActivity1.class.getSimpleName();
    private String userName, passWord;
    private EditText edtEmail, edtPass;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);

        // Nhan du lieu tu intent
        final Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        userName = bundle.getString(constants.KEY_USERNAME);
        passWord = bundle.getString(constants.KEY_PASSWORD);
//        userName = intent.getStringExtra(constants.KEY_USERNAME);
//        passWord = intent.getStringExtra(constants.KEY_PASSWORD);
        edtEmail = findViewById(R.id.edtEmail);
        edtPass = findViewById(R.id.edtPassword);
        edtEmail.setText(userName);
        edtPass.setText(passWord);
        btnlogin = findViewById(R.id.btnLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();

                intent1.putExtra(constants.KEY_USERNAME_BACK, edtEmail.getText().toString());
                intent1.putExtra(constants.KEY_PASSWORD_BACK, edtPass.getText().toString());
                setResult(RESULT_OK, intent1);
                finish();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, "on Start: ");
    }
}