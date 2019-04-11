package com.example.user.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {
            "Convert to Dollar",
            "Convert to Euro",
            "Convert to British pound sterling"
    };
    Integer[] imageArray = {
            R.drawable.dollar,
            R.drawable.euro,
            R.drawable.pound_sterling
    };
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Listview implementation
        CustomListAdapter adapter = new CustomListAdapter(this, nameArray, imageArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                    Intent intent = new Intent(view.getContext(), DollarActivity.class);
                    startActivity(intent);
                    break;

                    case 1:
                    Intent intent1 = new Intent(view.getContext(), EuroActivity.class);
                    startActivity(intent1);
                    break;

                    case 2:
                    Intent intent2 = new Intent(view.getContext(), BritishPoundActivity.class);
                    startActivity(intent2);
                    break;
                }
            }
        });

    }
}
