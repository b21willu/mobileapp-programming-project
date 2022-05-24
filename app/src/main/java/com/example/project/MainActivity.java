package com.example.project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b21willu";
    RecyclerView recyclerView;
    ArrayList<Arenas> arenasArrayList;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new JsonTask(this).execute(JSON_URL);

        recyclerView = findViewById(R.id.recycler_view);
        arenasArrayList = new ArrayList<>();
        adapter = new RecyclerViewAdapter(arenasArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Arenas>>() {}.getType();
        ArrayList<Arenas> list = gson.fromJson(json, type);
        arenasArrayList.addAll(list);
        adapter.notifyDataSetChanged();
    }
}
