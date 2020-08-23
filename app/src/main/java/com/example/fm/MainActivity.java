package com.example.fm;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText edtUser;
    private EditText edtPass;
    private String username, password;
    private static final int REQUEST_CODE = 2706;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        //Anh xa
        btnLogin = findViewById(R.id.btnSumit);
        edtUser = findViewById(R.id.username);
        edtPass = findViewById(R.id.password);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // show thong bao
                //Toast.makeText(MainActivity.this,"day la thong bao",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                username = edtUser.getText().toString();
                password = edtPass.getText().toString();
                Bundle bundle = new Bundle(); // thung hang chua du lieu
                bundle.putString(constants.KEY_USERNAME,username);
                bundle.putString(constants.KEY_PASSWORD,password);
                intent.putExtras(bundle);
                // chuyen activity

                intent.putExtra(constants.KEY_USERNAME, username); // gan du lieu cho intent ; gan username cho userName
                intent.putExtra(constants.KEY_PASSWORD, password);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                String userNameBack = data.getStringExtra(constants.KEY_USERNAME_BACK);
                String passwordBack = data.getStringExtra(constants.KEY_PASSWORD_BACK);
                edtUser.setText(userNameBack);
                edtPass.setText(passwordBack);
            }
        }
    }
}