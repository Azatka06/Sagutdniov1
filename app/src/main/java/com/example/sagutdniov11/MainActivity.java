package com.example.sagutdniov11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView finalView = (TextView) findViewById(R.id.textView5);
        final TextView nameView = (TextView) findViewById(R.id.name);
        final TextView emailView = (TextView) findViewById(R.id.email);
        Button okBtn=(Button)findViewById(R.id.ok);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //TO DO
                String NameT = nameView.getText().toString();
                String emailT = emailView.getText().toString();

                finalView.setText(getString(R.string.finalText, NameT, emailT));
            }
        });
        Button clearBtn=(Button)findViewById(R.id.clear);
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameView.setText("");
                emailView.setText("");
            }
        });
    }

}
