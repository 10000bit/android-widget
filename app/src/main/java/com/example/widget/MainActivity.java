package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.widget.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int sum, sub, mul;
    private double div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String str1 = binding.editText1.getText().toString();
               String str2 = binding.editText2.getText().toString();

               sum = Integer.parseInt(str1) + Integer.parseInt(str2);
               sub = Integer.parseInt(str1) - Integer.parseInt(str2);
               mul = Integer.parseInt(str1) * Integer.parseInt(str2);
               div = (double)Integer.parseInt(str1) / Integer.parseInt(str2);
               String division = String.format("%.1f", div);

               binding.textView.setText(sum + ", " + sub + ", " + mul + ", " + division);
           }
        });

    }
}
