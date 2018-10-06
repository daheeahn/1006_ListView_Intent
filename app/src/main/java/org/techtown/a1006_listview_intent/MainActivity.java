package org.techtown.a1006_listview_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ListViewItem> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listview);
        data=new ArrayList<>();
        data.add(new ListViewItem("욱일기 논란"));
        data.add(new ListViewItem("태풍 콩레이 영향"));
        data.add(new ListViewItem("조양호 회장"));
        data.add(new ListViewItem("이명박"));
        data.add(new ListViewItem("최종범 범죄자"));
        data.add(new ListViewItem("프로그라피"));

        ListViewAdapter adapter=new ListViewAdapter(this,R.layout.item,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ArticleActivity.class);
                intent.putExtra("title", data.get(position).getTitle().toString());
                startActivity(intent);

                Toast.makeText(MainActivity.this , data.get(position).getTitle(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
