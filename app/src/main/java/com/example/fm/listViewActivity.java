package com.example.fm;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class listViewActivity extends AppCompatActivity {
    private ListView listView;
    private ListViewAdapter listAdapter;
    private ArrayList<itemList> arrayList=new ArrayList<>();
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        listView = findViewById(R.id.listVieww);

        listAdapter = new ListViewAdapter(listViewActivity.this, arrayList);
        listView.setAdapter(listAdapter);

        arrayList.add(new itemList(R.drawable.github,"truyen 1","tac gia 1"));
        arrayList.add(new itemList(R.drawable.github,"truyen 2","tac gia 2"));
        arrayList.add(new itemList(R.drawable.github,"truyen 3","tac gia 3"));
        arrayList.add(new itemList(R.drawable.github,"truyen 4","tac gia 4"));
        arrayList.add(new itemList(R.drawable.github,"truyen 5","tac gia 5"));
        arrayList.add(new itemList(R.drawable.github,"truyen 6","tac gia 6"));

        listAdapter.notifyDataSetChanged();

        //su kien click cho item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(listViewActivity.this,"click: "+(position+1),Toast.LENGTH_LONG).show();
            }
        });

    }
}
