package com.example.architecturepattern.MVP.UIController;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.architecturepattern.R;

public class MainActivity extends AppCompatActivity implements MovieView {
    Presenter presenter;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        presenter=new Presenter(this);
        button=findViewById(R.id.click);
        textView=findViewById(R.id.textview);

        button.setOnClickListener(v->{
            presenter.getMovieName();
        });

    }

    @Override
    public void onGetMovieName(String MovieName) {
        textView.setText(MovieName);

    }
}