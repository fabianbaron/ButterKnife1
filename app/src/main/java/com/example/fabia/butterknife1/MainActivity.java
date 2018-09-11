package com.example.fabia.butterknife1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.myTextView)
    TextView myTextView;
    @BindView(R.id.myButton)
    Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.myButton,R.id.myButton2,R.id.myButton3})
    public void onClick() {
        //Cambiar texto
        myTextView.setText("Texto cambiado");
    }
}
