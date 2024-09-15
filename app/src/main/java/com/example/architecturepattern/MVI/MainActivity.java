package com.example.architecturepattern.MVI;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.architecturepattern.R;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    AddNumberViewmodel viewmodel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button=findViewById(R.id.buttonmvi);
        textView=findViewById(R.id.textViewmvi);
        viewmodel=new ViewModelProvider(this).get(AddNumberViewmodel.class);


        button.setOnClickListener(v->{
            //send
            viewmodel.processIntent(new AddNumber());
        });

        //render
        viewmodel.getViewState().observe(this, new Observer<Viewstate>() {
            @Override
            public void onChanged(Viewstate viewstate) {
                if (viewstate instanceof Number) {
                    textView.setText(String.valueOf(((Number) viewstate).getNumber()));
                } else if (viewstate instanceof Idle) {
                    textView.setText("Idle");
                } else if (viewstate instanceof Error) {
                    textView.setText(((Error) viewstate).getError());
                }
            }
        });

    }



}