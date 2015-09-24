package electroscholars.com.diylinefollowerrobot;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ListView;
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating an ItemClickListener for listview

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
          public void onItemClick(AdapterView<?> listView, View v, int position, long id){
              if (position == 0){
                  Intent beforeYouBeginIntent = new Intent(MainActivity.this, BeforeYouBeginActivity.class);
                  startActivity(beforeYouBeginIntent);
              } else if (position == 1) {
                  Intent arduinoIntent = new Intent(MainActivity.this, ArduinoCategoryActivity.class);
                  startActivity(arduinoIntent);
              } else if (position == 2){
                  Intent sensorIntent = new Intent(MainActivity.this, SensorCategoryActivity.class);
                  startActivity(sensorIntent);
              } else if (position == 3){
                  Intent lfrIntent = new Intent(MainActivity.this, LFRCategoryActivity.class);
                  startActivity(lfrIntent);
              }
          }
        };

        //Adding the listener to the listview
        ListView listView = (ListView) findViewById(R.id.top_list_options);
        listView.setOnItemClickListener(itemClickListener);
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
        if (id == R.id.about) {
            showAboutDialog();
        }
        return super.onOptionsItemSelected(item);
    }


    public void showAboutDialog(){
        CharSequence text = "Hello!\nI'm Manash Kumar Mandal\nEducation: EEE @ KUET, 2K12 Batch";
        CharSequence text2 = "Open Source Lover";
        CharSequence text3 = "Software Developer";
        CharSequence text4 = "Hardware Hobbyist";
        CharSequence text5 = "Interested in Robotics";
        CharSequence text6 = "Check My Projects @ http://github.com/manashmndl";
        CharSequence text7 = "Check out my blog @ http://medialab.electroscholars.com";
        CharSequence text8 = "Thank you for Using This App";
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.show();
        Toast toast2 = Toast.makeText(this, text2, Toast.LENGTH_SHORT);
        toast2.show();
        Toast toast3 = Toast.makeText(this, text3, Toast.LENGTH_SHORT);
        toast3.show();
        Toast toast4 = Toast.makeText(this, text4, Toast.LENGTH_SHORT);
        toast4.show();
        Toast toast5 = Toast.makeText(this, text5, Toast.LENGTH_SHORT);
        toast5.show();
        Toast toast6 = Toast.makeText(this, text6, Toast.LENGTH_LONG);
        toast6.show();
        Toast toast7 = Toast.makeText(this, text7, Toast.LENGTH_LONG);
        toast7.show();
        Toast toast8 = Toast.makeText(this, text8, Toast.LENGTH_LONG);
        toast8.show();
    }
}
