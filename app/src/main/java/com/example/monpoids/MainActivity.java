package com.example.monpoids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText taille =null;
    private EditText poid = null;
    private Button btn = null;
    private TextView result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText taille = findViewById(R.id.taille);
        final EditText poid = findViewById(R.id.poid);
        Button btn = findViewById(R.id.btn);
        final TextView result = findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double t=Double.parseDouble(taille.getText().toString());
                double p=Double.parseDouble(poid.getText().toString());

               double r=p/(t*t);


               String res="";


               if(r>40){
                   res="obésité morbide ou massive";

               }
               else if (r >=35 && r<=40){
                   res="obésité sévère";
               }
               else if (r >=30 && r<=35){
                   res="obésité modérée";
               }
               else if (r >=25 && r<=30){
                   res="surpoids";
               }
               else if (r >=18.5 && r<=25){
                   res="corpulence normale";
               }
               else if (r >=16.5 && r<=18.5){
                    res="maigreur";
                }
               else  {
                   res="maigreur";
               }

                result.setText(res);

            }
        });


    }
}
