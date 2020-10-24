package com.mcd.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends AppCompatActivity {
    final List<Animal> animals= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("cat", R.mipmap.ic_man));
        animals.add(new Animal("butterfly", R.mipmap.ic_butterfly));

        ListView listView = findViewById(R.id.listView);
        AnimalAdapter adapter = new AnimalAdapter(animals,this);
        listView.setAdapter(adapter);
    }
}