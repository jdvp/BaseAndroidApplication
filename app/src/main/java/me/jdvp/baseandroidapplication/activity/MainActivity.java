package me.jdvp.baseandroidapplication.activity;

import android.os.Bundle;
import android.widget.LinearLayout;

import butterknife.BindView;
import dagger.android.support.DaggerAppCompatActivity;
import me.jdvp.baseandroidapplication.R;

public class MainActivity extends DaggerAppCompatActivity {
    @BindView(R.id.fragment_container)
    LinearLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
