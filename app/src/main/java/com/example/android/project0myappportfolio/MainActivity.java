package com.example.android.project0myappportfolio;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toast[] toast = new Toast[1];

        Button spotifyButton = (Button) findViewById(R.id.spotifyButton);
        Button scoresButton = (Button) findViewById(R.id.scoresButton);
        Button libraryButton = (Button) findViewById(R.id.libraryButton);
        Button buildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        Button xyzReaderButton = (Button) findViewById(R.id.xyzReaderButton);
        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);

        Button[] buttonArray = {spotifyButton,scoresButton,libraryButton,buildItBiggerButton,xyzReaderButton,capstoneButton};

        for (final Button button : buttonArray)
        {
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (toast[0] != null) {
                        toast[0].cancel();
                    }
                    String appName = button.getText().toString();
                    Context context = getApplicationContext();
                    String text = "This button will launch " + appName + "!";
                    int duration = Toast.LENGTH_SHORT;

                    toast[0] = Toast.makeText(context, text, duration);
                    toast[0].show();
                }
            });
        }
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

    /** Called when the user touches the button */
    public void sendMessage(View view) {

    }
}


