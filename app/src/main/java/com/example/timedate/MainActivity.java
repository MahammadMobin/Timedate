package com.example.timedate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private DatePicker datePicker;
    Button selectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textviewid);
        selectButton = (Button) findViewById(R.id.buttonid);
        datePicker = (DatePicker) findViewById((R.id.Datepeaker));

        textView.setText(currentDate());

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(currentDate());
            }
        });

    }
    String currentDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("current date ");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append((datePicker.getYear()));

       return stringBuilder.toString();
    }
}