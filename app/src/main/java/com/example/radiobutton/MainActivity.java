package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb1,rb2,rb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
    }

    public void checkedButton(View view) {
        if(rb1.isChecked())
        {
            Toast.makeText(this, "YOU ORDERED PIZZA", Toast.LENGTH_SHORT).show();
        }
        if(rb2.isChecked())
        {
            Toast.makeText(this, "YOU ORDERED BURGER", Toast.LENGTH_SHORT).show();
        }
        if(rb3.isChecked())
        {
            Toast.makeText(this, "YOU ORDERED COKE", Toast.LENGTH_SHORT).show();
        }
        if(!rb1.isChecked()&&!rb2.isChecked()&&!rb3.isChecked())
            Toast.makeText(this, "Nothing Ordered", Toast.LENGTH_SHORT).show();
    }
}
