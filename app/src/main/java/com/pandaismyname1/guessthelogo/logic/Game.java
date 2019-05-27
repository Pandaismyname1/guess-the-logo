package com.pandaismyname1.guessthelogo.logic;

import com.pandaismyname1.guessthelogo.models.Logo;
import com.pandaismyname1.guessthelogo.models.LogoSet;
import com.pandaismyname1.guessthelogo.models.PlayableSet;

public class Game {
    private PlayableSet playableSet;
    private LogoSet logoSet;
    private int difficulty;
    private Logo currentLogo;
    private int currentIndex;
    private int triesLeft;
    private int correctGuesses;

    public Game(PlayableSet set, int difficulty) {
        this.playableSet = set;
        this.logoSet = new LogoSet();
        this.logoSet.InitializeSet(this.playableSet);
        this.difficulty = difficulty;
    }

    public void StartGame() {
        if (difficulty == 1) {
            triesLeft = 5;
        } else if (difficulty == 2) {
            triesLeft = 3;
        } else {
            triesLeft = 1;
        }
        correctGuesses = 0;

        logoSet.ScrambleSet();
        currentIndex = 0;
        currentLogo = logoSet.Get(currentIndex);
    }

    public void Guess(String guess) {
        if (difficulty == 1) {
            if (currentLogo.Answer.replace(" ", "").toLowerCase().equals(guess.replace(" ", "").toLowerCase())) {
                CorrectGuess();
            } else {
                WrongGuess();
            }
        } else if (difficulty == 2) {
            if (currentLogo.Answer.replace(" ", "").equals(guess.replace(" ", ""))) {
                CorrectGuess();
            } else {
                WrongGuess();
            }
        } else {
            if (currentLogo.Answer.equals(guess)) {
                CorrectGuess();
            } else {
                WrongGuess();
            }
        }
    }

    private void CorrectGuess() {
        correctGuesses++;
        currentIndex++;
        if (currentIndex > logoSet.LastIndex()) {
            currentIndex = 0;
            logoSet.ScrambleSet();
        }
        currentLogo = logoSet.Get(currentIndex);
    }

    private void WrongGuess() {
        triesLeft--;
        currentIndex++;
        if (currentIndex > logoSet.LastIndex()) {
            currentIndex = 0;
            logoSet.ScrambleSet();
        }
        currentLogo = logoSet.Get(currentIndex);
    }

    public int GetTriesLeft() {
        return triesLeft;
    }

    public int GetCorrectGuesses() {
        return correctGuesses;
    }

    public int GetCurrentImage() {
        return currentLogo.ResourceId;
    }
}
