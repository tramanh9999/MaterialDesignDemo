package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    String TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.nav_account);
    }

    Account accountFragment = new Account();
    Gallery galleryFragment = new Gallery();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_Bike: {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, galleryFragment).commit();

                Intent it= new Intent(this, LeftmenuActivty.class);
                startActivity(it);

                return true;
            }case R.id.nav_account:{
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, accountFragment).commit();
                return true;
            }

        }
        return false;

    }
}
