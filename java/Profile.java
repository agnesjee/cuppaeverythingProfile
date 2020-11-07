package com.example.cuppaeverythingprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void showAccountSettings(View view){
        Intent intent = new Intent(Profile.this, AccountSettings.class);
        startActivity(intent);
    }

    public void showMembership(View view){
        Intent intent = new Intent(Profile.this, Membership.class);
        startActivity(intent);
    }

    public void showPromotions(View view) {
        Intent intent = new Intent(Profile.this, Promotions.class);
        startActivity(intent);
    }

    public void showNotifications(View view){
        Intent intent = new Intent(Profile.this, Notifications.class);
        startActivity(intent);
    }

    public void showContactUs(View view){
        Intent intent = new Intent(Profile.this, ContactUs.class);
        startActivity(intent);
    }

    public void showAboutCuppaEverything(View view){
        Intent intent = new Intent(Profile.this, AboutCuppaEverything.class);
        startActivity(intent);
    }

    public void showLogout(View view){

        //Create the object of AlertDialog Builder class
        AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);

        //Set the message show for the Alert time
        builder.setMessage("Are you sure you want to log out ?");

        //Set Alert Title
        builder.setTitle("Log Out");

        //Set Cancelable false for when the user clicks on the outside, the Dialog Box then it will remain show
        builder.setCancelable(false);

        //Set the positive button with Yes name
        //OnclickListener method is use for DialogInterface interface.
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //When the user click yes button, the screen will return to login activity (change to login)
                Toast.makeText(Profile.this, "Log Out Successful", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Set the negative button with No name
        //OnclickListener method is use for DialogInterface interface.
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //If user click no, then dialog box is canceled.
                dialog.cancel();
            }
        });

        //Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        //Show the Alert Dialog box
        alertDialog.show();

    }


}
