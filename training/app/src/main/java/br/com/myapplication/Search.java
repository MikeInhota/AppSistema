package br.com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Search extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_layout);

        CustomAdapter customAdapter = new CustomAdapter(this, nameArray, infoArray);

        listView = (ListView)findViewById(R.id.ListViewId);
        listView.setAdapter(customAdapter);

    }

    String [] nameArray = {"A", "B", "C", "D", "E"};
    String [] infoArray = {"aaaa", "bbbb", "cccc", "dddd", "eeee"};
}
