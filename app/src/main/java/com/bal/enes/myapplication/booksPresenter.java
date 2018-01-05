package com.bal.enes.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class booksPresenter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_presenter);

        R.drawable.sample

        GridView gridView = findViewById(R.id.booksGridView);
        gridView.setAdapter(new BooksAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(booksPresenter.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
