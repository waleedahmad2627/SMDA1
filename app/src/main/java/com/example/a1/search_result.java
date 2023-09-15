package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class search_result extends AppCompatActivity {
    RecyclerView rv;
    List<itemModel> ls;
    ImageView img;
    myAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        ls = new ArrayList<>();
        adapter = new myAdapter(search_result.this,ls);

        ls.add(new itemModel("item name 1" , "price 1", "loc 1", "date 1"));
        ls.add(new itemModel("item name 2" , "price 2", "loc 2", "date 2"));
        ls.add(new itemModel("item name 3" , "price 3", "loc 3", "date 3"));
        ls.add(new itemModel("item name 4" , "price 4", "loc 4", "date 4"));
        ls.add(new itemModel("item name 5" , "price 5", "loc 5", "date 5"));
        ls.add(new itemModel("item name 6" , "price 6", "loc 6", "date 6"));
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        rv = findViewById(R.id.searchrv);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);

        img = findViewById(R.id.img);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(search_result.this,homepage.class);
                startActivity(intent);
            }
        });
    }
}