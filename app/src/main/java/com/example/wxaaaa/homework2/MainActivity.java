package com.example.wxaaaa.homework2;

import android.app.LauncherActivity;
import android.app.TabActivity;
import android.content.Intent;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TabHost;

public class MainActivity extends LauncherActivity {

    private String[] names = {"TabActivity", "PreferenceActivity"};

    private Class<?>[] clazz = {TabsActivity.class, PreferencesActivity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

    }

    @Override
    protected Intent intentForPosition(int i) {
        return new Intent(MainActivity.this, clazz[i]);
    }
}
