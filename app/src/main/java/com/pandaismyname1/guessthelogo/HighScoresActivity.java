package com.pandaismyname1.guessthelogo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HighScoresActivity extends AppCompatActivity {

    private String set;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);
        Intent intent = getIntent();

        set = intent.getStringExtra(MainActivity.EXTRA_SET);

        listView = findViewById(R.id.list);

        SharedPreferences prefs = this.getSharedPreferences("highscores", Context.MODE_PRIVATE);
        String hsJSONStr = prefs.getString("highscores", null);
        Map<String, String> scores = new HashMap<>();

        System.out.println(hsJSONStr);
        if (hsJSONStr == null) return;

        try {
            JSONObject root = new JSONObject(hsJSONStr);
            JSONArray jsonSet = root.getJSONArray(set);
            System.out.println(jsonSet);
            if (jsonSet == null) return;
            for (int i = 0; i < jsonSet.length(); i++) {
                System.out.println(jsonSet.getJSONObject(i));
                int score = jsonSet.getJSONObject(i).getInt("score");
                String name = jsonSet.getJSONObject(i).getString("name");
                scores.put(name, Integer.toString(score));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        List<HashMap<String, String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item, new String[]{"Name", "Score"}, new int[]{R.id.text1, R.id.text2});

        for (Map.Entry<String, String> stringStringEntry : scores.entrySet()) {
            HashMap<String, String> resultsMap = new HashMap<>();
            resultsMap.put("Name", ((Map.Entry) stringStringEntry).getKey().toString());
            resultsMap.put("Score", ((Map.Entry) stringStringEntry).getValue().toString());
            listItems.add(resultsMap);
        }

        listView.setAdapter(adapter);
    }
}
