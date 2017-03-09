package com.example.mohamed.tedradiohour;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;
    Toolbar toolbar;
    RecyclerView recyclerView;
    ArrayAdapter<Podcast> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        ArrayList<Podcast> problems = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            problems.add(new Podcast());
        }
        arrayAdapter = new ArrayAdapter<Podcast>(this,R.layout.support_simple_spinner_dropdown_item,problems);
        //recyclerView.setAdapter(arrayAdapter);


    }//

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.action_refresh:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    public class PodViewHolder extends RecyclerView.ViewHolder{
        public PodViewHolder(View itemView) {
            super(itemView);
        }
    }
}
