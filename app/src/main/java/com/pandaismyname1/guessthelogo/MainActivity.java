package com.pandaismyname1.guessthelogo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_SET = "com.pandaismyname1.guessthelogo.EXTRA_SET";
    public static final String EXTRA_DIF = "com.pandaismyname1.guessthelogo.EXTRA_DIF";
    public static final String EXTRA_CURRENT_SCORE = "com.pandaismyname1.guessthelogo.EXTRA_CURRENT_SCORE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStandard(View v) {
        Intent intent = new Intent(this, PlayActivity.class);
        intent.putExtra(EXTRA_SET, "All");
        intent.putExtra(EXTRA_DIF, 1);
        startActivity(intent);
    }

    public void onClickCars(View v) {
        Intent intent = new Intent(this, PlayActivity.class);
        intent.putExtra(EXTRA_SET, "Cars");
        intent.putExtra(EXTRA_DIF, 1);
        startActivity(intent);
    }

    public void onClickScores(View v) {
        Intent intent = new Intent(this, PlayActivity.class);
        intent.putExtra(EXTRA_SET, "All");
        intent.putExtra(EXTRA_DIF, 1);
        startActivity(intent);
    }
}
