package com.example.customized_tailoring;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button customButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customButton = findViewById(R.id.customButton);

        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMeasureActivity();
            }
        });
    }

    private void startMeasureActivity() {
        Intent intent = new Intent(MainActivity.this, MeasureActivity.class);
        startActivity(intent);
    }
}