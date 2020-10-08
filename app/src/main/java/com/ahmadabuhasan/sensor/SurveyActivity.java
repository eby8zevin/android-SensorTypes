package com.ahmadabuhasan.sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ahmad Abu Hasan on 9/10/2020.
 */

public class SurveyActivity extends AppCompatActivity {

    private SensorManager mSensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        setTitle("Sensor Survey");

        mSensorManager =
                (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> sensorList =
                mSensorManager.getSensorList(Sensor.TYPE_ALL);

        StringBuilder sensorText = new StringBuilder();

        for (Sensor currentSensor : sensorList) {
            sensorText.append(currentSensor.getName()).append(
                    System.getProperty("line.separator"));
        }

        TextView sensorTextView = findViewById(R.id.sensor_survey);
        sensorTextView.setText(sensorText);
    }
}