package com.pandaismyname1.guessthelogo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_SET = "com.pandaismyname1.guessthelogo.EXTRA_SET";
    public static final String EXTRA_DIF = "com.pandaismyname1.guessthelogo.EXTRA_DIF";
    public static final String EXTRA_CURRENT_SCORE = "com.pandaismyname1.guessthelogo.EXTRA_CURRENT_SCORE";

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.difficulty);
    }

    public void onClickStandard(View v) {
        Intent intent = new Intent(this, PlayActivity.class);
        intent.putExtra(EXTRA_SET, "All");
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.radioButton:
                intent.putExtra(EXTRA_DIF, 3);
                break;
            case R.id.radioButton2:
                intent.putExtra(EXTRA_DIF, 2);
                break;
            case R.id.radioButton3:
                intent.putExtra(EXTRA_DIF, 1);
                break;
        }
        startActivity(intent);
    }

    public void onClickCars(View v) {
        Intent intent = new Intent(this, PlayActivity.class);
        intent.putExtra(EXTRA_SET, "Cars");
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.radioButton:
                intent.putExtra(EXTRA_DIF, 3);
                break;
            case R.id.radioButton2:
                intent.putExtra(EXTRA_DIF, 2);
                break;
            case R.id.radioButton3:
                intent.putExtra(EXTRA_DIF, 1);
                break;
        }
        startActivity(intent);
    }

    public void onClickScores(View v) {
        Intent intent = new Intent(this, HighScoresActivity.class);
        intent.putExtra(EXTRA_SET, "All");
        startActivity(intent);
    }
    public void onClickCarScores(View v) {
        Intent intent = new Intent(this, HighScoresActivity.class);
        intent.putExtra(EXTRA_SET, "Cars");
        startActivity(intent);
    }
}
