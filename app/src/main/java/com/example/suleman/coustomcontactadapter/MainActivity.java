package com.example.suleman.coustomcontactadapter;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {
    ArrayList<User> users;
    ListView listView;
    private static CoustomAdapter adapter;
    private CoustomAdapter.ViewHolder view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list1);
        users= new ArrayList<>();

       users.add(new User("Suleman", "03153420690", "Male"));
        for(int i=0;i<=1000;i++){
            users.add(new User("suleman"+i,"03153420690","Male"));
        }
        adapter= new CoustomAdapter(users,this);
        listView.setAdapter(adapter);
        ///////////////////////
      }
}


