package com.example.cuppaeverythingprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AboutCuppaEverything extends AppCompatActivity {

    Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_cuppa_everything);

        btnUpdate = findViewById(R.id.btn_update_version);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutCuppaEverything.this, "This is the latest version", Toast.LENGTH_SHORT).show();
            }
        });


    }

}
