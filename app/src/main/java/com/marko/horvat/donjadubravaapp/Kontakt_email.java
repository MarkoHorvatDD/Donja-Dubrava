package com.marko.horvat.donjadubravaapp;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Kontakt_email extends AppCompatActivity {

    private Button bSend;


    private DrawerLayout mDrayverLayout;
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakt_email);

        initWidgets();

        setupListeners();


    }

    private void initWidgets() {


        bSend=findViewById(R.id.bSend);







    }

    private void setupListeners() {

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }


        });


        Intent intent= new Intent(Kontakt_email.this,Kontakt_email.class);


        Intent intent2 = new Intent(Intent.ACTION_SEND);


        intent2.setType("plain/text");
        intent2.putExtra(Intent.EXTRA_EMAIL, new String[]{"opcina-donja-dubrava@ck.htnet.hr"});
        intent2.putExtra(Intent.EXTRA_SUBJECT, "");


        startActivity(Intent.createChooser(intent2, "Odaberite Vaš e-mail klijent"));





        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


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










