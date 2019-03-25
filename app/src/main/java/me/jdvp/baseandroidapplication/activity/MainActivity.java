package me.jdvp.baseandroidapplication.activity;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.disposables.CompositeDisposable;
import me.jdvp.baseandroidapplication.R;
import me.jdvp.baseandroidapplication.viewmodel.impl.ImageViewModel;

public class MainActivity extends DaggerAppCompatActivity {

    private TextView textView;

    @Inject
    ImageViewModel imageViewModel;

    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textView = findViewById(R.id.hello_world_text_view);
    }


    @Override
    public void onResume() {
        super.onResume();


        compositeDisposable.add(
                imageViewModel.getImages().subscribe(
                        imageList -> {//we have an image list
                            String first = imageList.getImages().get(0).getUrl();
                            textView.setText(first);
                        },
                        throwable -> {},    //error case, we have a throwable object
                        () -> {}            //totally done
                )
        );
    }

    @Override
    public void onPause() {
        super.onPause();
        compositeDisposable.clear();
    }
}
