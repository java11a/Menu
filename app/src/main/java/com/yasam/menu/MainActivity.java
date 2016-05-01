package com.yasam.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        LinearLayout rv = (LinearLayout) view.getParent();

        int count = rv.getChildCount();

        for(int i=0; i<count; i++){
            View child = rv.getChildAt(i);

            if(!(child instanceof Button)){
                Log.v(this.getClass().getSimpleName(), ((TextView)child).getText().toString());
            }
        }
    }
}
