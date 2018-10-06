package org.techtown.a1006_listview_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ArticleActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        textView = (TextView) findViewById(R.id.article_title);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");

        textView.setText(title);
    }
}
