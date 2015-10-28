package com.example.ealezel.displaythemessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class FirstScreen extends AppCompatActivity {

    public final static String EXTRA_MESSAGE1 = "MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    public void GoToSecondScreen(View view)
    {
        Intent goSecondIntent = new Intent(this, SecondScreen.class);
        EditText editText = (EditText) findViewById(R.id.InputEditText);
        EditText editText2 = (EditText) findViewById(R.id.Enput2EditText);

        String firstMessage = editText.getText().toString();
        String secondMessage = editText2.getText().toString();

        goSecondIntent.putExtra(EXTRA_MESSAGE1, firstMessage);
        goSecondIntent.putExtra(EXTRA_MESSAGE2, secondMessage);
        startActivity(goSecondIntent);
    }

}
