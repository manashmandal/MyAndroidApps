package com.electroscholars.manash.beveragechooser;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainBeverageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_beverage);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_beverage, menu);
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


    public void toasterOn(View view){
        boolean on = ((ToggleButton) view).isChecked();

        if (on){
            int duration = Toast.LENGTH_SHORT;
            CharSequence text = (CharSequence) ((ToggleButton) view).getTextOn();
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        } else {
            int duration = Toast.LENGTH_SHORT;
            CharSequence text = (CharSequence) ((ToggleButton) view).getTextOff();
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        }

    }

    public void onCheckBoxClick(View view){
        int duration = Toast.LENGTH_SHORT;
        CharSequence toastText = (CharSequence) ((CheckBox) view).getText();
        Toast toast = Toast.makeText(this, toastText, duration);
        toast.show();
    }
}
