package ru.dvsoshnikov.intent;

import static ru.dvsoshnikov.intent.R.*;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ActionBar;
import android.annotation.SuppressLint;
import android.widget.TextView;
import android.os.Bundle;

public class ViewActivity extends AppCompatActivity {

    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_view);
        this.setTitle("Settings");
    }
}