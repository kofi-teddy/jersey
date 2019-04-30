package com.example.jersey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JerseyCustomization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jersey_customization);

        Intent intent = getIntent();
        Bundle jerseyDetails = intent.getExtras();

        String jerseyName = jerseyDetails.getString("JerseyName");
        Double jerseyNumber = jerseyDetails.getDouble("jerseyNumber");

        TextView name = (TextView) findViewById(R.id.name);
        TextView number = (TextView) findViewById(R.id.number);

        name.setText(jerseyName);
        String sJerseyNumber = Double.toString(jerseyNumber);
        number.setText(sJerseyNumber);
    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
