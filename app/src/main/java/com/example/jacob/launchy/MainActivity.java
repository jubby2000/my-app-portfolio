package com.example.jacob.launchy;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void announceToast(View view) {

        //This allows us to switch the text of the toast for each button
        String namer = "app";
        switch (view.getId()){
            case R.id.button:
                namer = getString(R.string.app1);
                break;
            case R.id.button2:
                namer = getString(R.string.app2);
                break;
            case R.id.button3:
                namer = getString(R.string.app3);
                break;
            case R.id.button4:
                namer = getString(R.string.app4);
                break;
            case R.id.button5:
                namer = getString(R.string.app5);
                break;
            case R.id.button6:
                namer = getString(R.string.app6);
                break;
        }

        //This actually switches the text when creating the toast
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my "+namer+" app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
}
