package com.pandaismyname1.guessthelogo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.pandaismyname1.guessthelogo.logic.Game;
import com.pandaismyname1.guessthelogo.models.PlayableSet;

public class PlayActivity extends AppCompatActivity {

    private Game game;
    private PlayableSet currentSet;
    private String setString;
    private int difficulty;

    private EditText logo_guess;
    private TextView tries_left;
    private TextView correct_guesses;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Intent intent = getIntent();
        setString = intent.getStringExtra(MainActivity.EXTRA_SET);
        difficulty = intent.getIntExtra(MainActivity.EXTRA_DIF, 1);
        if ("All".equals(setString)) {
            currentSet = PlayableSet.All;
        } else if ("Cars".equals(setString)) {
            currentSet = PlayableSet.Cars;
        } else if ("Pokemon".equals(setString)) {
            currentSet = PlayableSet.Pokemon;
        }
        game = new Game(currentSet, difficulty);
        game.StartGame();

        logo_guess = findViewById(R.id.logo_guess);
        tries_left = findViewById(R.id.tries_remaining);
        correct_guesses = findViewById(R.id.correct_guesses);
        imageView = findViewById(R.id.logo_image);
        imageView.setImageResource(game.GetCurrentImage());
        tries_left.setText(String.format(getResources().getString(R.string.tries_remaining), game.GetTriesLeft()));
        correct_guesses.setText(String.format(getResources().getString(R.string.current_guesses), game.GetCorrectGuesses()));
    }

    @Override
    protected void onResume() {
        super.onResume();
        tries_left.setText(String.format(getResources().getString(R.string.tries_remaining), game.GetTriesLeft()));
        correct_guesses.setText(String.format(getResources().getString(R.string.current_guesses), game.GetCorrectGuesses()));
        imageView.setImageResource(game.GetCurrentImage());
    }

    public void onClickGuess(View v) {
        game.Guess(logo_guess.getText().toString());

        if (game.GetTriesLeft() <= 0) {
            game.StartGame();
            onClickAbandon(v);
        }

        tries_left.setText(String.format(getResources().getString(R.string.tries_remaining), game.GetTriesLeft()));
        correct_guesses.setText(String.format(getResources().getString(R.string.current_guesses), game.GetCorrectGuesses()));
        imageView.setImageResource(game.GetCurrentImage());
        logo_guess.setText("");
    }

    public void onClickAbandon(View v) {
        imageView.setImageResource(game.GetCurrentImage());
        Intent intent = new Intent(this, AddScoreActivity.class);
        intent.putExtra(MainActivity.EXTRA_CURRENT_SCORE, game.GetCorrectGuesses());
        startActivity(intent);
        game.StartGame();
    }
}
