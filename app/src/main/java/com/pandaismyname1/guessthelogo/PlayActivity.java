package com.pandaismyname1.guessthelogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.pandaismyname1.guessthelogo.models.LogoSet;
import com.pandaismyname1.guessthelogo.models.PlayableSet;

public class PlayActivity extends AppCompatActivity {

    private LogoSet set;
    private String setString;
    private int difficulty;

    private EditText logo_guess;
    private TextView tries_left;
    private TextView correct_guesses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        setString = savedInstanceState.getString("set","All");
        difficulty = savedInstanceState.getInt("set",1);
        if ("All".equals(setString)) {
            set.InitializeSet(PlayableSet.All);
        } else if ("Cars".equals(setString)) {
            set.InitializeSet(PlayableSet.Cars);
        } else if ("Pokemon".equals(setString)) {
            set.InitializeSet(PlayableSet.Pokemon);
        }
        set.ScrambleSet();
    }
}
