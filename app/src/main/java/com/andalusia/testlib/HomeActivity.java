package com.andalusia.testlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView txtWelocme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtWelocme = findViewById(R.id.home_txt_hello);

        if(getIntent().getStringExtra("phone") != null){
            txtWelocme.setText("Welcome: " + getIntent().getStringExtra("phone") + " to " + R.string.app_name);
        }else {
            txtWelocme.setVisibility(View.GONE);
        }
    }
}
