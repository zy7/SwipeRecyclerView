package com.zy.swiperecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.zy.widget.swiperecyclerview.SwipeRecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private SwipeRecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> data = new ArrayList<>();
        data.add("第1");
        data.add("第2");
        data.add("第3");
        data.add("第4");
        data.add("第5");
        data.add("第6");
        data.add("第7");
        data.add("第8");
        data.add("第9");
        data.add("第10");
        data.add("第11");
        data.add("第12");
        data.add("第13");
        data.add("第14");
        data.add("第15");
        data.add("第16");
        data.add("第17");
        data.add("第18");
        data.add("第19");
        data.add("第20");
        data.add("第21");
        data.add("第22");
        MyAdapter adapter = new MyAdapter(data);

        rv = findViewById(R.id.rv);
        rv.addItemDecoration(new DividerItemDecoration(this, 1));
        rv.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, "item" + position, Toast.LENGTH_SHORT).show();
            }
        });
        adapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, "menu" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
