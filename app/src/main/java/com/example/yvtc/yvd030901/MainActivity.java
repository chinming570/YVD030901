package com.example.yvtc.yvd030901;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.yvtc.yvd030901.R.id.checkBox;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1, chk2, chk3;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1 = (CheckBox) findViewById(checkBox);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);

        chk1.setOnCheckedChangeListner(new CompoundButton.OnCheckedChangeListner() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    Log.d("CHK", "chk1 打勾");
                } else
                {
                    Log.d("CHK", "chk1不 打勾");
                }
            }


        });
    }