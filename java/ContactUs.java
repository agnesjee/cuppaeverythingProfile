package com.example.cuppaeverythingprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactUs extends AppCompatActivity {

    EditText etName, etEmail, etMessage;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        etName = findViewById(R.id.et_cu_name);
        etEmail = findViewById(R.id.et_cu_email);
        etMessage = findViewById(R.id.et_cu_message);
        btnSend = findViewById(R.id.btn_cu_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = etName.getText().toString();
                String inputEmail = etEmail.getText().toString();
                String inputMessage = etMessage.getText().toString();

                if (inputName.isEmpty() || inputEmail.isEmpty() || inputMessage.isEmpty())
                    Toast.makeText(ContactUs.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(ContactUs.this, "Sent successfully", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
