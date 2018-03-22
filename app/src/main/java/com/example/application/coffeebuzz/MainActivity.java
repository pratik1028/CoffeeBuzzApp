package com.example.application.coffeebuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(MainActivity.this,DrinkCategoryActivity.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent1=new Intent(MainActivity.this,FoodCategoryActivity.class);
                    startActivity(intent1);
                }
                if(position==2){
                    Intent intent2=new Intent(MainActivity.this,OtherCategoryActivity.class);
                    startActivity(intent2);
                }
            }

        };
        ListView listView=(ListView)findViewById(R.id.List_options);
                listView.setOnItemClickListener(itemClickListener);

    }
}
