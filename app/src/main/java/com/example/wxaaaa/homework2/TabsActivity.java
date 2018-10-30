package com.example.wxaaaa.homework2;

import android.app.LauncherActivity;
import android.content.Intent;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabsActivity extends android.app.TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tab);

        TabHost tabHost = getTabHost();
        tabHost.addTab(tabHost.newTabSpec("list").setIndicator("列表")
                .setContent(new Intent(this, ClassNumberActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("list").setIndicator("本机设置")
                .setContent(new Intent(this, PreferencesActivity.class)));
    }
}
