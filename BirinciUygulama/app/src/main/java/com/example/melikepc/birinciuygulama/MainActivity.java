package com.example.melikepc.birinciuygulama;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnWelcome= (Button) findViewById(R.id.btn_Welcome);
        tvHello=(TextView) findViewById(R.id.tv_Hello);
    }

    public void ButtonClick(View v){
        switch (v.getId()){
            case R.id.btn_Welcome:{
                tvHello.setText("Wlecome to Android course");
                tvHello.setTextColor(Color.RED);
                tvHello.setTextSize(20);
                break;
            }
            case R.id.btn_Second:{
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_Third:{
                Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
