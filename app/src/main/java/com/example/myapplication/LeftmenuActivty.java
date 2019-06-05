package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class LeftmenuActivty extends AppCompatActivity {
DrawerLayout drawerLayout;
ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leftmenu_activty);


        drawerLayout= findViewById(R.id.drawer);
//        actionBarDrawerToggle= new ActionBarDrawerToggle(this,drawerLayout,, 0);

    }
}
