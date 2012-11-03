package com.xmldb.iviet;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ActivityMain extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lo_activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.lo_activity_main, menu);
        return true;
    }
}
