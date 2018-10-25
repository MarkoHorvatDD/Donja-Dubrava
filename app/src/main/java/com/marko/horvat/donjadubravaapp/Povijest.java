package com.marko.horvat.donjadubravaapp;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class Povijest extends AppCompatActivity {


    private DrawerLayout mDrayverLayout;
    private ActionBarDrawerToggle mToggle;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povijest);

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





