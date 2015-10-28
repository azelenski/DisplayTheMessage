package com.example.ealezel.displaythemessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    //public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    public final static String EXTRA_MESSAGE1 = "MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "MESSAGE2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        TextView firstMessageTextView = (TextView) findViewById(R.id.OutputTextView);
        TextView secondMessageTextView = (TextView) findViewById(R.id.Output2TextView);

        Intent intent = getIntent();
        String firstMessage = intent.getStringExtra(EXTRA_MESSAGE1);
        String secondMessage = intent.getStringExtra(EXTRA_MESSAGE2);

        firstMessageTextView.setText(firstMessage);
        secondMessageTextView.setText(secondMessage);
    }


    public void GoToSecondScreen(View view)
    {

        Intent goFirstIntent = new Intent(this, FirstScreen.class);
        startActivity(goFirstIntent);
    }
}
