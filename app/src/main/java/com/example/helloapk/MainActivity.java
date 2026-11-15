package com.example.helloapk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello from Lafei");
        tv.setTextSize(28);
        tv.setGravity(Gravity.CENTER);
        setContentView(tv);
    }
}
