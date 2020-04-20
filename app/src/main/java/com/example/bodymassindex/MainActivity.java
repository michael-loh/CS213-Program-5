package com.example.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button calculateBMI;
    TextView showBMI;
    EditText weight;
    EditText height;
    RadioButton metric;
    RadioButton imperial;

    /**
     * This is the on Create method that loads the app and assigns the fields in this class to their corressponding objects.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateBMI = findViewById(R.id.calculateBMI);
        showBMI = findViewById(R.id.showBMI);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        metric = findViewById(R.id.metric);
        imperial = findViewById(R.id.imperial);

        imperial.setChecked(true);
    }


    public void calculateBMI( View view ){

        if(fieldsEmpty()){
            showBMI.setText( "Error: Fill in all fields");
            return;
        }

        double w = Double.parseDouble( weight.getText().toString() );
        double h = Double.parseDouble( height.getText().toString() );

        boolean m = metric.isChecked();
        showBMI.setText( BodyMassIndex.calculateBMI(w, h, m ) + "" );
    }

    private boolean fieldsEmpty(){
        if(weight.getText().length() == 0 || height.getText().length() == 0){
            return true;
        }
        return false;
    }


}
