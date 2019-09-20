package com.example.sorde.studentdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private Button find;
    private EditText roll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        find =findViewById(R.id.edRoll);
        roll =findViewById(R.id.tderoll);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(roll.getText().toString());
            }
        });
    }

    private void validate(String roll) {
        if (roll.equals("13")) {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("9")) {
            Intent intent = new Intent(SecondActivity.this, AoboniActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("5")) {
            Intent intent = new Intent(SecondActivity.this, RoniActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("3")) {
            Intent intent = new Intent(SecondActivity.this, PromiActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("1")) {
            Intent intent = new Intent(SecondActivity.this, JannatiActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("2")) {
            Intent intent = new Intent(SecondActivity.this, DottoActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("4")) {
            Intent intent = new Intent(SecondActivity.this, SharminActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("6")) {
            Intent intent = new Intent(SecondActivity.this, ZinatActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("7")) {
            Intent intent = new Intent(SecondActivity.this, ChondaActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("11")) {
            Intent intent = new Intent(SecondActivity.this, OmorActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("14")) {
            Intent intent = new Intent(SecondActivity.this, DawanActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("15")) {
            Intent intent = new Intent(SecondActivity.this, SojibActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("20")) {
            Intent intent = new Intent(SecondActivity.this, tanvirActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("18")) {
            Intent intent = new Intent(SecondActivity.this, ShohanActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("22")) {
            Intent intent = new Intent(SecondActivity.this, MuktaActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("19")) {
            Intent intent = new Intent(SecondActivity.this, SupriyaActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("21")) {
            Intent intent = new Intent(SecondActivity.this, ChompaActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("17")) {
            Intent intent = new Intent(SecondActivity.this, SujonActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("181")) {
            Intent intent = new Intent(SecondActivity.this, RintyActivity.class);
            startActivity(intent);
        }
        else if (roll.equals("8")) {
            Intent intent = new Intent(SecondActivity.this, HujaifaActivity.class);
            startActivity(intent);
        }

    }
}



