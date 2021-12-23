package com.example.planirovhik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView button2 = (TextView) findViewById(R.id.textView8);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        Intent intent;
        switch(v.getId()){
            case R.id.textView8:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com/reference/android/net/Uri.html"));
                startActivity(intent);
        }
    }
}

