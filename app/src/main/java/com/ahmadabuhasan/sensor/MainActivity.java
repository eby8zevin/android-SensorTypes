package com.ahmadabuhasan.sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Ahmad Abu Hasan on 9/10/2020.
 */

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager mSensorManager;
    //Sensor
    private Sensor mSensorAccelerometer;
    private Sensor mSensorAmbient;
    private Sensor mSensorGravity;
    private Sensor mSensorGyroscope;
    private Sensor mSensorLight;
    private Sensor mSensorLinear;
    private Sensor mSensorMagnetic;
    private Sensor mSensorOrientation;
    private Sensor mSensorPressure;
    private Sensor mSensorProximity;
    private Sensor mSensorRelative;
    private Sensor mSensorRotation;
    private Sensor mSensorTemperature;
    //TextView
    private TextView mTextSensorAccelerometerx;
    private TextView mTextSensorAccelerometery;
    private TextView mTextSensorAccelerometerz;
    private TextView mTextSensorAmbient;
    private TextView mTextSensorGravityx;
    private TextView mTextSensorGravityy;
    private TextView mTextSensorGravityz;
    private TextView mTextSensorGyroscopex;
    private TextView mTextSensorGyroscopey;
    private TextView mTextSensorGyroscopez;
    private TextView mTextSensorLight;
    private TextView mTextSensorLinearx;
    private TextView mTextSensorLineary;
    private TextView mTextSensorLinearz;
    private TextView mTextSensorMagnetic;
    private TextView mTextSensorOrientationx;
    private TextView mTextSensorOrientationy;
    private TextView mTextSensorOrientationz;
    private TextView mTextSensorPressure;
    private TextView mTextSensorProximity;
    private TextView mTextSensorRelative;
    private TextView mTextSensorRotationx;
    private TextView mTextSensorRotationy;
    private TextView mTextSensorRotationz;
    private TextView mTextSensorTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextSensorAccelerometerx = findViewById(R.id.Accex);
        mTextSensorAccelerometery = findViewById(R.id.Accey);
        mTextSensorAccelerometerz = findViewById(R.id.Accez); //1
        mTextSensorAmbient = findViewById(R.id.A_Temp); //2
        mTextSensorGravityx = findViewById(R.id.Gravx);
        mTextSensorGravityy = findViewById(R.id.Gravy);
        mTextSensorGravityz = findViewById(R.id.Gravz); //3
        mTextSensorGyroscopex = findViewById(R.id.Gyrox);
        mTextSensorGyroscopey = findViewById(R.id.Gyroy);
        mTextSensorGyroscopez = findViewById(R.id.Gyroz); //4
        mTextSensorLight = (TextView) findViewById(R.id.Light); //5
        mTextSensorLinearx = findViewById(R.id.Linex);
        mTextSensorLineary = findViewById(R.id.Liney);
        mTextSensorLinearz = findViewById(R.id.Linez); //6
        mTextSensorMagnetic = findViewById(R.id.Magn); //7
        mTextSensorOrientationx = findViewById(R.id.Oriex);
        mTextSensorOrientationy = findViewById(R.id.Oriey);
        mTextSensorOrientationz = findViewById(R.id.Oriez); //8
        mTextSensorPressure = findViewById(R.id.Pres); //9
        mTextSensorProximity = findViewById(R.id.Prox); //10
        mTextSensorRelative = findViewById(R.id.Rela); //11
        mTextSensorRotationx = findViewById(R.id.Rotax);
        mTextSensorRotationy = findViewById(R.id.Rotay);
        mTextSensorRotationz = findViewById(R.id.Rotaz); //12
        mTextSensorTemperature = findViewById(R.id.Temp); //13

        mSensorManager = (SensorManager) getSystemService(
                Context.SENSOR_SERVICE);

        mSensorAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorAmbient = mSensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
        mSensorGravity = mSensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY);
        mSensorGyroscope = mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        mSensorLight = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        mSensorLinear = mSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        mSensorMagnetic = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        mSensorOrientation = mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION);
        mSensorPressure = mSensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        mSensorProximity = mSensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        mSensorRelative = mSensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY);
        mSensorRotation = mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);
        mSensorTemperature = mSensorManager.getDefaultSensor(Sensor.TYPE_TEMPERATURE);

        String sensor_error = getResources().getString(R.string.error_no_sensor);

        if (mSensorAccelerometer == null) { //1
            mTextSensorAccelerometerx.setText(sensor_error);
            mTextSensorAccelerometery.setText(sensor_error);
            mTextSensorAccelerometerz.setText(sensor_error);
        }
        if (mSensorAmbient == null) { //2
            mTextSensorAmbient.setText(sensor_error);
        }
        if (mSensorGravity == null) { //3
            mTextSensorGravityx.setText(sensor_error);
            mTextSensorGravityy.setText(sensor_error);
            mTextSensorGravityz.setText(sensor_error);
        }
        if (mSensorGyroscope == null) { //4
            mTextSensorGyroscopex.setText(sensor_error);
            mTextSensorGyroscopey.setText(sensor_error);
            mTextSensorGyroscopez.setText(sensor_error);
        }
        if (mSensorLight == null) { //5
            mTextSensorLight.setText(sensor_error);
        }
        if (mSensorLinear == null) { //6
            mTextSensorLinearx.setText(sensor_error);
            mTextSensorLineary.setText(sensor_error);
            mTextSensorLinearz.setText(sensor_error);
        }
        if (mSensorMagnetic == null) { //7
            mTextSensorMagnetic.setText(sensor_error);
        }
        if (mSensorOrientation == null) { //8
            mTextSensorOrientationx.setText(sensor_error);
            mTextSensorOrientationy.setText(sensor_error);
            mTextSensorOrientationz.setText(sensor_error);
        }
        if (mSensorPressure == null) { //9
            mTextSensorPressure.setText(sensor_error);
        }
        if (mSensorProximity == null) { //10
            mTextSensorProximity.setText(sensor_error);
        }
        if (mSensorRelative == null) { //11
            mTextSensorRelative.setText(sensor_error);
        }
        if (mSensorRotation == null) { //12
            mTextSensorRotationx.setText(sensor_error);
            mTextSensorRotationy.setText(sensor_error);
            mTextSensorRotationz.setText(sensor_error);
        }
        if (mSensorTemperature == null) { //13
            mTextSensorTemperature.setText(sensor_error);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mSensorAccelerometer != null) {
            mSensorManager.registerListener(this, mSensorAccelerometer, //1
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorAmbient != null) {
            mSensorManager.registerListener(this, mSensorAmbient, //2
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorGravity != null) {
            mSensorManager.registerListener(this, mSensorGravity, //3
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorGyroscope != null) {
            mSensorManager.registerListener(this, mSensorGyroscope, //4
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorLight != null) {
            mSensorManager.registerListener(this, mSensorLight, //5
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorLinear != null) {
            mSensorManager.registerListener(this, mSensorLinear, //6
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorMagnetic != null) {
            mSensorManager.registerListener(this, mSensorMagnetic, //7
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorOrientation != null) {
            mSensorManager.registerListener(this, mSensorOrientation, //8
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorPressure != null) {
            mSensorManager.registerListener(this, mSensorPressure, //9
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorProximity != null) {
            mSensorManager.registerListener(this, mSensorProximity, //10
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorRelative != null) {
            mSensorManager.registerListener(this, mSensorRelative, //11
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorRotation != null) {
            mSensorManager.registerListener(this, mSensorRotation, //12
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorTemperature != null) {
            mSensorManager.registerListener(this, mSensorTemperature, //13
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        mSensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        int sensorType = sensorEvent.sensor.getType();

        float currentValue = sensorEvent.values[0];

        switch (sensorType) {
            case Sensor.TYPE_ACCELEROMETER:
                mTextSensorAccelerometerx.setText(getResources().getString(
                        R.string.type_accelerometerx, currentValue + sensorEvent.values[0]));
                mTextSensorAccelerometery.setText(getResources().getString(
                        R.string.type_accelerometery, currentValue + sensorEvent.values[1]));
                mTextSensorAccelerometerz.setText(getResources().getString(
                        R.string.type_accelerometerz, currentValue + sensorEvent.values[2]));
                break;
            case Sensor.TYPE_AMBIENT_TEMPERATURE:
                mTextSensorAmbient.setText(getResources().getString(
                        R.string.type_ambient_temperature, currentValue));
                break;
            case Sensor.TYPE_GRAVITY:
                mTextSensorGravityx.setText(getResources().getString(
                        R.string.type_gravityx, currentValue + sensorEvent.values[0]));
                mTextSensorGravityy.setText(getResources().getString(
                        R.string.type_gravityy, currentValue + sensorEvent.values[1]));
                mTextSensorGravityz.setText(getResources().getString(
                        R.string.type_gravityz, currentValue + sensorEvent.values[2]));
            case Sensor.TYPE_GYROSCOPE:
                mTextSensorGyroscopex.setText(getResources().getString(
                        R.string.type_gyroscopex, currentValue + sensorEvent.values[0]));
                mTextSensorGyroscopey.setText(getResources().getString(
                        R.string.type_gyroscopey, currentValue + sensorEvent.values[1]));
                mTextSensorGyroscopez.setText(getResources().getString(
                        R.string.type_gyroscopez, currentValue + sensorEvent.values[2]));
            case Sensor.TYPE_LIGHT:
                mTextSensorLight.setText(getResources().getString(
                        R.string.type_light, currentValue));
                break;
            case Sensor.TYPE_LINEAR_ACCELERATION:
                mTextSensorLinearx.setText(getResources().getString(
                        R.string.type_linear_accelerationx, currentValue + sensorEvent.values[0]));
                mTextSensorLineary.setText(getResources().getString(
                        R.string.type_linear_accelerationy, currentValue + sensorEvent.values[1]));
                mTextSensorLinearz.setText(getResources().getString(
                        R.string.type_linear_accelerationz, currentValue + sensorEvent.values[2]));
                break;
            case Sensor.TYPE_MAGNETIC_FIELD:
                float azimuth = Math.round(sensorEvent.values[0]);
                float pitch = Math.round(sensorEvent.values[1]);
                float roll = Math.round(sensorEvent.values[2]);

                double tesla = Math.sqrt((azimuth * azimuth) + (pitch * pitch) + (roll * roll));
                mTextSensorMagnetic.setText(getResources().getString(
                        R.string.type_magnetic_field, tesla));
                break;
            case Sensor.TYPE_ORIENTATION:
                mTextSensorOrientationx.setText(getResources().getString(
                        R.string.type_orientationx, currentValue + sensorEvent.values[0]));
                mTextSensorOrientationy.setText(getResources().getString(
                        R.string.type_orientationy, currentValue + sensorEvent.values[1]));
                mTextSensorOrientationz.setText(getResources().getString(
                        R.string.type_orientationz, currentValue + sensorEvent.values[2]));
                break;
            case Sensor.TYPE_PRESSURE:
                mTextSensorPressure.setText(getResources().getString(
                        R.string.type_pressure, currentValue));
                break;
            case Sensor.TYPE_PROXIMITY:
                mTextSensorProximity.setText(getResources().getString(
                        R.string.type_proximity, currentValue));
                break;
            case Sensor.TYPE_RELATIVE_HUMIDITY:
                mTextSensorRelative.setText(getResources().getString(
                        R.string.type_relative_humidity, currentValue) + " %");
                break;
            case Sensor.TYPE_ROTATION_VECTOR:
                mTextSensorRotationx.setText(getResources().getString(
                        R.string.type_rotation_vectorx, currentValue + sensorEvent.values[0]));
                mTextSensorRotationy.setText(getResources().getString(
                        R.string.type_rotation_vectory, currentValue + sensorEvent.values[1]));
                mTextSensorRotationz.setText(getResources().getString(
                        R.string.type_rotation_vectorz, currentValue + sensorEvent.values[2]));
                break;
            case Sensor.TYPE_TEMPERATURE:
                mTextSensorTemperature.setText(getResources().getString(
                        R.string.type_temperature, currentValue));
                break;
            default:
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about) {
            startActivity(new Intent(this, AboutActivity.class));
        } else if (item.getItemId() == R.id.sensor_survey) {
            startActivity(new Intent(this, SurveyActivity.class));
        }
        return true;
    }
}