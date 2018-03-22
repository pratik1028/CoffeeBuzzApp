package com.example.application.coffeebuzz;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OtherCategoryActivity extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listOthers = getListView();
        ArrayAdapter<Others> listAdapter = new ArrayAdapter<Others>(
                this,
                android.R.layout.simple_list_item_1,
                Others.others
        );
        listOthers.setAdapter(listAdapter);

    }

    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(OtherCategoryActivity.this, OtherActivity.class);
       // intent.putExtra(OtherActivity.EXTRA_OTHERNO, (int) id);
        startActivity(intent);
    }
}
