package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    Spinner sp1,sp2;
    EditText edt1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.textView);
        edt1=(EditText) findViewById(R.id.etAmount);
        t3=(TextView) findViewById(R.id.textView2);
        t4=(TextView) findViewById(R.id.textView3);
        sp1=(Spinner) findViewById(R.id.spinner);
        sp2=(Spinner) findViewById(R.id.spinner2);
        t2=(TextView) findViewById(R.id.tvAmount);
        b1=(Button) findViewById(R.id.convert);

        String[] From={"USD"};
        ArrayAdapter ad=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,From);
        sp1.setAdapter(ad);

        String[] To ={"Indian Rupees","Shrilanka Rupees"};
        ArrayAdapter ad1=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,To);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Double tool;

                 Double amount = Double.parseDouble(edt1.getText().toString());

                 if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    
                    double tot = amount * 70.0;
                    Toast.makeText(getApplicationContext(),tot+"" , Toast.LENGTH_SHORT).show();
                }
                 else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Shrilanka Rupees")
                 {
                     double tot = amount * 180.0;
                     Toast.makeText(getApplicationContext(),tot+"", Toast.LENGTH_SHORT).show();
                 }
            }
        });






    }
}