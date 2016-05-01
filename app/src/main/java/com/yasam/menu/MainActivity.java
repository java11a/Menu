package com.yasam.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        String menuItem1 = null;
        TextView txtVwMenuItem1 = (TextView) findViewById(R.id.txtVw_menuItem1);
        if(txtVwMenuItem1!=null)
            menuItem1 = txtVwMenuItem1.getText().toString();

        if(menuItem1!=null)
            Log.v(this.getClass().getSimpleName(), menuItem1);


        String menuItem2 = null;
        TextView txtVwMenuItem2 = (TextView) findViewById(R.id.txtVw_menuItem2);
        if(txtVwMenuItem2!=null)
            menuItem2 = txtVwMenuItem2.getText().toString();

        if(menuItem2!=null)
            Log.v(this.getClass().getSimpleName(), menuItem2);


        String menuItem3 = null;
        TextView txtVwMenuItem3 = (TextView) findViewById(R.id.txtVw_menuItem3);
        if(txtVwMenuItem3!=null)
            menuItem3 = txtVwMenuItem3.getText().toString();

        if(menuItem3!=null)
            Log.v(this.getClass().getSimpleName(), menuItem3);
    }
}
