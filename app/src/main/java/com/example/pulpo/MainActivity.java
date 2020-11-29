package com.example.pulpo;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Thread crono;
    int hora, minutos, segundos, segundosCrono = 0, minutosCrono = 0;
    CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendario = Calendar.getInstance();

        final TextView textView1 = findViewById(R.id.textView1);
        Button btnCancel=findViewById(R.id.btn_cancel);
        Button btnStart=findViewById(R.id.btn_start);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.start();
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
            }
        });

        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);

        //  textView1.setText(hora + ":" + minutos);



       countDownTimer = new CountDownTimer(80000, 1000) {
            public void onTick(long millisUntilFinished) {
                textView1.setText(String.format(Locale.getDefault(), "%d sec.", millisUntilFinished / 1000L));
            }
            public void onFinish() {
                textView1.setText("Done.");
            }
        }.start();


//
    }
}