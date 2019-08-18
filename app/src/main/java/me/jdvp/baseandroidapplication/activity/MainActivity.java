package me.jdvp.baseandroidapplication.activity;

import android.os.Bundle;

import dagger.android.support.DaggerAppCompatActivity;
import me.jdvp.baseandroidapplication.R;

public class MainActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
