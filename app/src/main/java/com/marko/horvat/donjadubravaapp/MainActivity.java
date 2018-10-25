package com.marko.horvat.donjadubravaapp;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private DrawerLayout mDrayverLayout;
    private ActionBarDrawerToggle mToggle;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.wwWebView);
        webView.loadUrl("http://www.donjadubrava.hr/dd3/default.asp?sid=2");
        webView.getSettings().setJavaScriptEnabled(true);


        mDrayverLayout = findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrayverLayout, R.string.open, R.string.close);
        mDrayverLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {


            if (webView.canGoBack()) {
                webView.goBack();
            } else {
                super.onBackPressed();
            }



        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }


        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }


    Fragment fragment = null;


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {


        int id = item.getItemId();

        if (id == R.id.povijest) {

            startActivity(new Intent(MainActivity.this, Povijest.class));

        } else if (id == R.id.fotogalerija) {

            startActivity(new Intent(MainActivity.this, Fotogalerija.class));
        } else if (id == R.id.osnovnaskola) {

            startActivity(new Intent(MainActivity.this, OsnovnaSkola.class));


        } else if (id == R.id.activty_telefonski_imenik) {

            startActivity(new Intent(MainActivity.this, TelefonskiImenik.class));





        } else if (id == R.id.kontakt) {

            startActivity(new Intent(MainActivity.this, Kontakt_email.class));



        } else if (id == R.id.vijesti) {

            startActivity(new Intent(MainActivity.this, Vijesti.class));




        } else if (id == R.id.activty_map) {

            double latitude = 46.315;
            double longitude = 16.812;
            String label = "DONJA DUBRAVA";
            String uriBegin = "geo:" + latitude + "," + longitude;
            String query = latitude + "," + longitude + "(" + label + ")";
            String encodedQuery = Uri.encode(query);
            String uriString = uriBegin + "?q=" + encodedQuery + "&z=7";
            Uri uri = Uri.parse(uriString);
            Intent mapIntent = new Intent(android.content.Intent.ACTION_VIEW, uri);
            startActivity(mapIntent);








        }

   DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;




}}















