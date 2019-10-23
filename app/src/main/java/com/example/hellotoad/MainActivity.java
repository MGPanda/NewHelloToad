package com.example.hellotoad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text);
        num = 0;
    }
    public void showToast(View view) {
        Toast t = Toast.makeText(getApplicationContext(), Integer.toString(num), Toast.LENGTH_SHORT);
        t.show();
    }
    public void increase(View view) {
        num++;
        tv.setText(Integer.toString(num));
    }
}
