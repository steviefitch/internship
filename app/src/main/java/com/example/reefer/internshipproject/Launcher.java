package com.example.reefer.internshipproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Launcher extends Activity {
    private TextView title_Text;
    private View v;
    private Button mLaunchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        title_Text = (TextView) findViewById(R.id.textView);
        Typeface lato = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf");
        title_Text.setTypeface(lato);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        double x = Math.pow(dm.widthPixels/dm.xdpi,2);
        double y = Math.pow(dm.heightPixels/dm.ydpi,2);
        double screenInches = Math.sqrt(x + y);
        Log.d("debug", "Screen inches : " + screenInches);
        System.out.println("Screen inches : " + screenInches);

        screenInches=  (double)Math.round(screenInches * 10) / 10;
        System.out.println("Screen inches : " + screenInches);
        mLaunchButton = (Button) findViewById(R.id.launchButton);
        mLaunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do Something
                System.out.println("Button Pressed");

                Intent i = new Intent(Launcher.this, game.class);
                System.out.println(i);
                startActivity(i);
            }
        });
    }
}
