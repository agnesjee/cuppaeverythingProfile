package com.example.cuppaeverythingprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePassword extends AppCompatActivity {

    EditText etCPassword, etNPassword;
    Button btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        etCPassword = findViewById(R.id.et_current_password);
        etNPassword = findViewById(R.id.et_new_password);
        btnChange = findViewById(R.id.btn_change_password);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputCPassword = etCPassword.getText().toString();
                String inputNPassword = etNPassword.getText().toString();

                if (inputCPassword.isEmpty() || inputNPassword.isEmpty())
                    Toast.makeText(ChangePassword.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(ChangePassword.this, "Change successfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
