package com.example.shrey.androidpre_workproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd=new Random();
                int ranColor= Color.argb(255, rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
                ((TextView) findViewById(R.id.textView3)).setTextColor(ranColor);
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd=new Random();
                int ranColor= Color.argb(255, rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
                findViewById(R.id.rootView).setBackgroundColor(ranColor);
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Text=((EditText) findViewById(R.id.EditText)).getText().toString();
                if(TextUtils.isEmpty(Text))
                    ((TextView) findViewById(R.id.textView3)).setText("Hello from Shreyas!");
                else
                    ((TextView) findViewById(R.id.textView3)).setText(Text);
                ((EditText) findViewById(R.id.EditText)).setText("");
            }
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView3)).setTextColor(Color.BLACK);
                findViewById(R.id.rootView).setBackgroundColor(Color.parseColor("#800000"));
                ((TextView) findViewById(R.id.textView3)).setText("Hello from Shreyas!");
                ((EditText) findViewById(R.id.EditText)).setText("");

            }
        });
    }

}
