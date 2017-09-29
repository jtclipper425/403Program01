package com.homework1.jtclippe.homework1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showBio(View view)
    {
        EditText editFirstName = (EditText) findViewById(R.id.editFirstName);
        EditText editLastName = (EditText) findViewById(R.id.editLastName);
        EditText editSchool = (EditText) findViewById(R.id.editSchool);
        Spinner spnGradYear = (Spinner) findViewById(R.id.spnGradYear);
        Spinner spnDegree = (Spinner) findViewById(R.id.spnDegree);
        Spinner spnMajor = (Spinner) findViewById(R.id.spnMajor);
        EditText editFavorite = (EditText) findViewById(R.id.editFavorite);

        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();
        String school = editSchool.getText().toString();
        String gradYear = spnGradYear.getSelectedItem().toString();
        String degree = spnDegree.getSelectedItem().toString();
        String major = spnMajor.getSelectedItem().toString();
        String favoriteActivities = editFavorite.getText().toString();

        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra("firstName", firstName);
        intent.putExtra("lastName", lastName);
        intent.putExtra("school", school);
        intent.putExtra("gradYear", gradYear);
        intent.putExtra("degree", degree);
        intent.putExtra("major", major);
        intent.putExtra("favoriteActivities", favoriteActivities);
        startActivity(intent);

    }
}
