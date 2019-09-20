package com.example.sorde.studentdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private  int counter=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.etNmae);
        Password = findViewById(R.id.etPassword);
        Info = findViewById(R.id.tvinfo);
        Login = findViewById(R.id.buttonLogin);
        Info.setText("No. of attempts remaining : 3");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPassword){

        if ((userName.equals("student")) && (userPassword.equals("2019")) ){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
        else{
            counter --;
            Info.setText("no. of attempte remaining" + String.valueOf(counter));
            if(counter == 0) {
                Login.setEnabled(false);
            }
        }

    }
}
