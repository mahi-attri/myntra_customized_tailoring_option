package com.example.customized_tailoring;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;




import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MeasureActivity extends AppCompatActivity {

    private ImageView arrowImageView;
    private TextView measureTextView, guideTextView;
    private EditText bustEditText, frontLengthEditText, fitWaistEditText, waistEditText, hipsEditText, acrossShoulderEditText, outseamLengthEditText, inseamLengthEditText, commentsEditText;
    private Button saveButton, confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);

        // Initialize views
        arrowImageView = findViewById(R.id.arrow);
        measureTextView = findViewById(R.id.measure);

        bustEditText = findViewById(R.id.bust);
        frontLengthEditText = findViewById(R.id.frontlength);
        fitWaistEditText = findViewById(R.id.fitWaist);
        waistEditText = findViewById(R.id.waist);
        hipsEditText = findViewById(R.id.hips);
        acrossShoulderEditText = findViewById(R.id.across_shoulder);
        outseamLengthEditText = findViewById(R.id.outseam_length);
        inseamLengthEditText = findViewById(R.id.inseam_length);
        commentsEditText = findViewById(R.id.comments);

        guideTextView = findViewById(R.id.guide);
        saveButton = findViewById(R.id.save);
        confirmButton = findViewById(R.id.confirm);

        // Add any logic you want to handle, e.g., button click listeners
        saveButton.setOnClickListener(v -> saveMeasurements());
        confirmButton.setOnClickListener(v -> confirmMeasurements());
    }

    private void saveMeasurements() {
        // Implement the logic to save measurements
        String bust = bustEditText.getText().toString();
        String fitWaist = fitWaistEditText.getText().toString();
        String waist = waistEditText.getText().toString();
        String hips = hipsEditText.getText().toString();
        String acrossShoulder = acrossShoulderEditText.getText().toString();
        // Add the logic to handle the saved measurements
    }

    private void confirmMeasurements() {
        // Implement the logic to confirm measurements
        // This could be sending the data to a server or processing it further
    }
}