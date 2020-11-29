package com.example.pulpo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int hora, minutos, segundos;
        Calendar calendario = Calendar.getInstance();

        TextView textView1 = findViewById(R.id.textView1);

        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);

        textView1.setText(hora + ":" + minutos);

       int segundosP;
       for (segundosP = 0; segundosP < 80; segundosP++) {
            textView1.setText(String.valueOf(segundosP));

        }

    }




    }
}