package com.marko.horvat.donjadubravaapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Vijesti extends AppCompatActivity {


    private Button button;

    private Button button2;


    private DrawerLayout mDrayverLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vijesti);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);



        button = (Button) findViewById(R.id.buttonCall);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View viev) {
                dialContactPhone("+385 (0)40 688-919");
            }


            private void dialContactPhone(final String phoneNumber) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));



            }


    });






    button2 = (Button) findViewById(R.id.buttonCall2);

        button2.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View viev) {
            dialContactPhone2("+385 (0)91 5048-052");
        }



        private void dialContactPhone2(final String phoneNumber) {
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
        }
    });

}









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;


    }






    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }




}





