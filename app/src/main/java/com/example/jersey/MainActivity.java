package com.example.jersey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void customizeJersey(View view) {
        Intent intent = new Intent(this, JerseyCustomization.class );

        Bundle jerseyDetails = new Bundle();

        EditText number = (EditText) findViewById(R.id.number);
        EditText name = (EditText) findViewById(R.id.name);

        String JerseyName = name.getText().toString();
        String JerseyNumber = number.getText().toString();

        jerseyDetails.putDouble("JerseyNumber", Double.parseDouble(JerseyNumber));
        jerseyDetails.putString("JerseyName", JerseyName );

        intent.putExtras(jerseyDetails);

        startActivity(intent);

    }
}
