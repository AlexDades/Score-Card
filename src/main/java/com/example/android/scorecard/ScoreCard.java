package com.example.android.scorecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreCard extends AppCompatActivity {
int scoreRigo = 0;
int scoreLoma = 0;
    // Save values of scores
    static final String SCORE_RIGO = "rigo";
    static final String SCORE_LOMA = "loma";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_card);
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt(SCORE_RIGO, scoreRigo);
        savedInstanceState.putInt(SCORE_LOMA, scoreLoma);
        super.onSaveInstanceState(savedInstanceState);
    }
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);


        // Restore state members from saved instance
        scoreRigo = savedInstanceState.getInt(SCORE_RIGO);
        scoreLoma = savedInstanceState.getInt(SCORE_LOMA);
        displayForRigo(scoreRigo);
        displayForLoma(scoreLoma);
    }
    public void displayForRigo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_rigandeaux);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForLoma(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_lomachenko);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForRigo(View v) {
        scoreRigo+=1;
        displayForRigo(scoreRigo);
    }

    public void addTwoForRigo(View v) {
        scoreRigo+=2;
        displayForRigo(scoreRigo);
    }

    public void addThreeForRigo(View v) {
        scoreRigo+=3;
        displayForRigo(scoreRigo);
    }

    public void addOneForLoma(View v) {
        scoreLoma+=1;
        displayForLoma(scoreLoma);
    }
    public void addTwoForLoma(View v) {
        scoreLoma+=2;
        displayForLoma(scoreLoma);
    }
    public void addThreeForLoma(View v) {
        scoreLoma+=3;
        displayForLoma(scoreLoma);
    }
    public void resetScore(View view){
        scoreRigo=0;
        scoreLoma=0;
        displayForRigo(scoreRigo);
        displayForLoma(scoreLoma);
    }
}


