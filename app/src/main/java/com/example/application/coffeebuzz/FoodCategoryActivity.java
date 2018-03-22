package com.example.application.coffeebuzz;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listFoods=getListView();
        ArrayAdapter<Foods> listAdapter=new ArrayAdapter<Foods>(
                this,
                android.R.layout.simple_list_item_1,
                Foods.foods
        );
        listFoods.setAdapter(listAdapter);
    }
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);
       // intent.putExtra(FoodActivity.EXTRA_FOODNO, (int) id);
        startActivity(intent);
    }
}

