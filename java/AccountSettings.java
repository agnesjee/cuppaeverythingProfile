package com.example.cuppaeverythingprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AccountSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);
    }

    public void showEditProfile (View view){
        Intent intent = new Intent(AccountSettings.this, EditProfile.class);
        startActivity(intent);
    }

    public void showChangePassword (View view){
        Intent intent = new Intent(AccountSettings.this, ChangePassword.class);
        startActivity(intent);
    }

    public void showLinkedAccounts (View view){
        Intent intent = new Intent(AccountSettings.this, LinkedAccounts.class);
        startActivity(intent);
    }

}
