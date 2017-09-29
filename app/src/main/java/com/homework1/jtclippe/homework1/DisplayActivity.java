package com.homework1.jtclippe.homework1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent callingIntent = getIntent();
        String firstName = callingIntent.getStringExtra("firstName");
        String lastName = callingIntent.getStringExtra("lastName");
        String school = callingIntent.getStringExtra("school");
        String gradYear = callingIntent.getStringExtra("gradYear");
        String degree = callingIntent.getStringExtra("degree");
        String major = callingIntent.getStringExtra("major");
        String favoriteActivities = callingIntent.getStringExtra("favoriteActivities");

        TextView txtOut = (TextView) findViewById(R.id.textView);

        txtOut.setText(String.format("%1$s %2$s holds a %3$s in %4$s from %5$s and graduated in %6$s. Their interests include %7$s.",
        firstName, lastName, degree, major, school, gradYear, favoriteActivities));

    }
}
