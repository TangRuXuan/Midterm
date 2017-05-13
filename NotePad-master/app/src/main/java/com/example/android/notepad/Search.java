package com.example.android.notepad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

/**
 * Created by Work-S on 2017/4/28.
 */

public class Search extends Activity {
    private EditText editText;
    private Button button;
    private String key;
    Context context;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitu_search);
        context=this;

        editText= (EditText) findViewById(R.id.et_search);
        key = editText.getText().toString();
        button= (Button) findViewById(R.id.btn_search);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent=new Intent(context,NotesList2.class);
                startActivity(intent);
            }
        });

    }

}
