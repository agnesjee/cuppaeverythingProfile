package com.example.cuppaeverythingprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditProfile extends AppCompatActivity {

    EditText etFname, etLname, etEmail, etAreacode, etPhone, etAddress, etPostcode, etState;
    Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        etFname = findViewById(R.id.et_ep_fname);
        etLname = findViewById(R.id.et_ep_lname);
        etEmail = findViewById(R.id.et_ep_email);
        etAreacode = findViewById(R.id.et_ep_areacode);
        etPhone = findViewById(R.id.et_ep_phone);
        etAddress = findViewById(R.id.et_ep_address);
        etPostcode = findViewById(R.id.et_ep_postcode);
        etState = findViewById(R.id.et_ep_state);
        btnUpdate = findViewById(R.id.btn_update_profile);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputFname = etFname.getText().toString();
                String inputLname = etLname.getText().toString();
                String inputEmail = etEmail.getText().toString();
                String inputAreacode = etAreacode.getText().toString();
                String inputPhone = etPhone.getText().toString();
                String inputAddress = etAddress.getText().toString();
                String inputPostcode = etPostcode.getText().toString();
                String inputState = etState.getText().toString();

                if (inputFname.isEmpty() || inputLname.isEmpty() || inputEmail.isEmpty() || inputAreacode.isEmpty() || inputPhone.isEmpty() || inputAddress.isEmpty() || inputPostcode.isEmpty() || inputState.isEmpty()){
                    Toast.makeText(EditProfile.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(EditProfile.this, "Update Successfully", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
