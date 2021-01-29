package com.example.testretrofit;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DemoActivity2 extends AppCompatActivity {
    private  static final  String TAG = "DemoActivity2";

    private Button button_translate;
    private EditText edittext_before;
    private TextView textview_after;
    private String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);


        edittext_before = findViewById(R.id.edittext_before);
        textview_after = findViewById(R.id.textview_after);
        button_translate = findViewById(R.id.button_translate);


        button_translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content= edittext_before.getText().toString();
                Log.d(TAG,"+++++++++++++++++++"+content+"+++++++++++++++++++++");
                request(content);
            }
        });
    }


    public void request(String content){
        Retrofit retrofit = new Retrofit.Builder()
                                        .baseUrl("http://fanyi.youdao.com/")
                                        .addConverterFactory(GsonConverterFactory.create())
                                        .build();

        PostRequest_Interface  request = retrofit.create(PostRequest_Interface.class);

        Call<Translation2>  call = request.getCall(content);

        call.enqueue(new Callback<Translation2>() {
            @Override
            public void onResponse(Call<Translation2> call, Response<Translation2> response) {
                textview_after.setText(response.body().getTranslateResult().get(0).get(0).getTgt());
            }

            @Override
            public void onFailure(Call<Translation2> call, Throwable t) {
                System.out.println("请求失败！");
                System.out.println(t.getMessage());
            }
        });

    }

}