package com.warot.android.bitgrid;

import android.app.ActivityManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import static com.warot.android.bitgrid.R.id.bit0;
import static com.warot.android.bitgrid.R.id.bit1;
import static com.warot.android.bitgrid.R.id.bit2;
import static com.warot.android.bitgrid.R.id.bit3;

public class MainActivity extends AppCompatActivity {
    CheckBox cb0,cb1,cb2,cb3;
    EditText txtdecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb0 = (CheckBox) findViewById(bit0);
        cb1 = (CheckBox) findViewById(bit1);
        cb2 = (CheckBox) findViewById(bit2);
        cb3 = (CheckBox) findViewById(bit3);

        txtdecimal = (EditText) findViewById(R.id.txtHex);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void doClickstuff(View v) {

    }

    public void doCheckbox(View v) {
        int sum;
        String s;
        sum = 0;
        if (cb0.isChecked()) sum += 1;
        if (cb1.isChecked()) sum += 2;
        if (cb2.isChecked()) sum += 4;
        if (cb3.isChecked()) sum += 8;
       
        txtdecimal.setText(Integer.toHexString(sum));
    }

    public void btnTestClicked(View v) {

        // a Toast is a message that goes away on its own, leaned about it at
        // https://www.youtube.com/watch?v=bIZzbsARVbc
        // 8:17 into the video

        Toast.makeText(this, R.string.TestNotification, Toast.LENGTH_LONG).show();
        finishAndRemoveTask();
    }
}
