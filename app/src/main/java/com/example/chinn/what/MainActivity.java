package com.example.chinn.what;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    int year;
    int Branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button nextPage = (Button) findViewById(R.id.button);

        Spinner yearSpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String>myAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.yearSpinner));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearSpinner.setAdapter(myAdapter);
        yearSpinner.setOnItemSelectedListener(this);


        Spinner BranchSpinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String>BranchAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.BranchSpinner));
        BranchSpinner.setAdapter(BranchAdapter);
        BranchSpinner.setOnItemSelectedListener(this);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(year >0 && year<=8)
                openNext();
                else
                    Toast.makeText(getApplicationContext(),"please choose a year",Toast.LENGTH_LONG).show();
            }
        });

    }


    public void openNext(){
        Intent open = new Intent(getApplicationContext(), Subjects.class);
        open.putExtra("yeaar",year);
        open.putExtra("branch",Branch);
        startActivity(open);
    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(parent.getId() == R.id.spinner)
            year = position;
        else if (parent.getId()==R.id.spinner2)
            Branch = position;


    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}
