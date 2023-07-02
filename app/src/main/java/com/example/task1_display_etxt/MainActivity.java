package com.example.task1_display_etxt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView eo=findViewById(R.id.emailFinal);
        EditText ei=findViewById(R.id.emailInput);
        TextView po=findViewById(R.id.passswordFinal);
        EditText pi=findViewById(R.id.passwordInput);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=ei.getText().toString();
                String password=pi.getText().toString();
                eo.setText(" Submitted mail is ->"+email);
                po.setText(" Submitted password is->"+password);

            }
        });



    }
}