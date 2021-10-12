package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    public static final String TAG = "WeatherActivity";

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment lmeow = ForecastFragment.newInstance("", "");
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, lmeow).commit();
        Log.i("Weather", "onCreate: ");
    }*/

    private void commit() {
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Weather", "onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Weather", "onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Weather", "onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Weather", "onStop: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "onDestroy: ");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment ff = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, ff).commit();
    }
}
