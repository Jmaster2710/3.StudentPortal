package com.example.joel_.studentportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String mNewLinkUrl, mNewLinkName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Bundle extras = getIntent().getExtras();

        final List<Portal> mPortals = new ArrayList<>();

        if(extras != null) {
            mNewLinkUrl = extras.getString("newURL"); // retrieve the data using keyName
            mNewLinkName = extras.getString("newName");
            mPortals.add(new Portal(mNewLinkUrl,mNewLinkName));
        }
        //Add a few standard Portals
        mPortals.add(new Portal("https://Google.com", "Google"));
        mPortals.add(new Portal("https://Facebook.com", "Facebook"));
        //Assigning the layout manager.

        final RecyclerView mPortalRecyclerView = findViewById(R.id.RecyclerView);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 3);

        mPortalRecyclerView.setLayoutManager(mLayoutManager);
        PortalAdapter mAdapter = new PortalAdapter(this, mPortals);
        mPortalRecyclerView.setAdapter(mAdapter);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CreatePortalActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

}
