package com.example.photocheckin_android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
//import android.widget.TextView;

public class registerform extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView tv = new TextView(this);
//        tv.setText("AAAA");
//        setContentView(tv);
        setContentView(R.layout.index_registerform);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}