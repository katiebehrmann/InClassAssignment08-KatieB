package com.example.android.inclassassignment08_katieb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {


    private EditText addPlace;
    private EditText addMiles;
    private CheckBox beenThere;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference roadTripRef = database.getReference("Road Trip");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        addPlace = (EditText) findViewById(R.id.add_place);
        beenThere = (CheckBox) findViewById(R.id.been_there);
        addMiles = (EditText) findViewById(R.id.add_miles);


    }

    public void add(View view) {
        String place = addPlace.getText().toString();
        int miles = Integer.parseInt(addMiles.getText().toString());
        boolean been = beenThere.isChecked();

        RoadTrip fun = new RoadTrip(place, miles, been);
        roadTripRef.push().setValue(fun);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}

