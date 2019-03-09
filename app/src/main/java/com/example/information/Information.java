package com.example.information;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Information extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informaion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();



        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new InformationFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_information);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.informaion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.nav_information:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new InformationFragment()).commit();
                break;
            case R.id.nav_my_events:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MyEventsFragment()).commit();
                break;
            case R.id.calendar:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CalendarFragment()).commit();
                break;
            case R.id.speakers:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SpeakersFragment()).commit();
                break;
            case R.id.more:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MoreFragment()).commit();
                break;
            case R.id.feedback:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show();
                break;
           /* case R.id.nav_log_out:
                Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show();
                //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                //      new LoginActivity()).commit();
                Intent in=new Intent(this, LoginActivity.class);
                startActivity(in);
                break;*/
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
