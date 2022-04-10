package com.example.twitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.twitter.MomentActivity;
import com.example.twitter.ProfileActivity;
import com.example.twitter.SettingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.profile){
            startActivity(new Intent(this, ProfileActivity.class));
        } else if(item.getItemId()==R.id.setting){
            startActivity(new Intent(this, SettingActivity.class));
        } else if(item.getItemId()==R.id.moment){
            startActivity(new Intent(this, MomentActivity.class));
        }
        return true;
    }
}