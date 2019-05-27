package com.pandaismyname1.guessthelogo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONObject;

public class AddScoreActivity extends AppCompatActivity {

    private int score;
    private String set;

    private EditText name_edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_score);
        Intent intent = getIntent();
        set = intent.getStringExtra(MainActivity.EXTRA_SET);
        score = intent.getIntExtra(MainActivity.EXTRA_CURRENT_SCORE, 0);

        name_edit_text = findViewById(R.id.editText2);
    }

    public void onClickSubmit(View v) {
        SharedPreferences prefs = this.getSharedPreferences("highscores", Context.MODE_PRIVATE);
        String hsJSONStr = prefs.getString("highscores", null);
        String result = "";
        JSONObject root;
        JSONArray jsonSet;
        try {
            JSONObject newScore = new JSONObject();
            newScore.put("name", name_edit_text.getText().toString());
            newScore.put("score", score);
            if (hsJSONStr != null) {
                root = new JSONObject(hsJSONStr);
            } else {
                root = new JSONObject();
                jsonSet = new JSONArray();
                root.put("All", jsonSet);
                jsonSet = new JSONArray();
                root.put("Cars", jsonSet);
            }
            jsonSet = root.getJSONArray(set);
            jsonSet.put(newScore);
            result = root.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
        prefs.edit().putString("highscores", result).apply();

        Intent intent = new Intent(this, HighScoresActivity.class);
        intent.putExtra(MainActivity.EXTRA_SET, set);
        startActivity(intent);
    }

    public void onClickShare(View v) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Hey I just guessed " + score + " on the set " + set + " logos. Yay me!";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "New Score");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
}
