package com.example.testretrofit;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_demo1,button_demo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main");

        button_demo1 = findViewById(R.id.button_demo1);
        button_demo2 = findViewById(R.id.button_demo2);
        button_demo1.setOnClickListener(this);
        button_demo2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.button_demo1:
                Intent intent1 = new Intent(MainActivity.this,DemoActivity1.class);
                startActivity(intent1);
                break;

            case  R.id.button_demo2:
                Intent intent2 = new Intent(MainActivity.this,DemoActivity2.class);
                startActivity(intent2);
                break;
        }
    }
}