package com.example.cuppaeverythingprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class Notifications extends AppCompatActivity {

    Switch switchPN, switchEmail, switchSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        switchPN = findViewById(R.id.switch_pn);
        switchEmail = findViewById(R.id.switch_email);
        switchSMS = findViewById(R.id.switch_sms);

        switchPN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String statusSwitch;
                if (switchPN.isChecked())
                    statusSwitch = "Push Notifications enabled.";
                else
                    statusSwitch = "Push Notifications disabled.";

                Toast.makeText(Notifications.this, statusSwitch, Toast.LENGTH_SHORT).show();
            }
        });

        switchEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String statusSwitch;
                if (switchEmail.isChecked())
                    statusSwitch = "Email Notifications enabled.";
                else
                    statusSwitch = "Email Notifications disabled.";

                Toast.makeText(Notifications.this, statusSwitch, Toast.LENGTH_SHORT).show();
            }
        });

        switchSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String statusSwitch;
                if (switchSMS.isChecked())
                    statusSwitch = "SMS Notifications enabled.";
                else
                    statusSwitch = "SMS Notifications disabled.";

                Toast.makeText(Notifications.this, statusSwitch, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
