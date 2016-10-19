package com.example.nkostya.lab2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Intent;


public class MyActivity extends ActionBarActivity {

    private TextView mText;

    private Button mRedButton;
    private Button mYellowButton;
    private Button mGreenButton;
    private Button mInfoButton;

    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mText = (TextView) findViewById(R.id.text);

        mRedButton = (Button) findViewById(R.id.buttonRed);
        mInfoButton = (Button) findViewById(R.id.infoButton);
        mYellowButton = (Button) findViewById(R.id.buttonYellow);
        mYellowButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mText.setText(R.string.yellow);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });

        mGreenButton = (Button) findViewById(R.id.buttonGreen);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.relative);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void redButtonClick(View view) {
        mText.setText(R.string.red);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.red));
    }

    /*public void yellowButtonClick(View view) {
        mText.setText(R.string.yellow);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellow));
    }*/

    public void greenButtonClick(View view) {
        mText.setText(R.string.green);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.green));
    }

    public void click(View view) {
        Intent intent = new Intent(MyActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}
