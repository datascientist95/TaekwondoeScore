package com.exemple.android.taekwondoescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.padding;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    private static final String SCORE_TEAM_A = "teamascore";
    private static final String SCORE_TEAM_B = "teambscore";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt(SCORE_TEAM_A);
            scoreTeamB = savedInstanceState.getInt(SCORE_TEAM_B);

        }
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * inscrease score by 3 points team A
     */
    public void add_3_points(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * inscrease score by 2 points team A
     */
    public void add_2_points(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * inscrease score by 1 points team A
     */
    public void add_1_points(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * decrease score by 3 points team A
     */
    public void reduce_3_points(View v) {
        scoreTeamA = scoreTeamA - 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * decrease score by 2 points team A
     */
    public void reduce_2_points(View v) {
        scoreTeamA = scoreTeamA - 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * decrease score by 1 points team A
     */
    public void reduce_1_points(View v) {
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
    }



    /**
     * inscrease score by 3 points team B
     */
    public void add_3_points_B(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * inscrease score by 2 points team B
     */
    public void add_2_points_B(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * inscrease score by 1 points team B
     */
    public void add_1_points_B(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * decrease score by 3 points team B
     */
    public void reduce_3_points_B(View v) {
        scoreTeamB = scoreTeamB - 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * decrease score by 2 points team B
     */
    public void reduce_2_points_B(View v) {
        scoreTeamB = scoreTeamB - 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * decrease score by 1 points team B
     */
    public void reduce_1_points_B(View v) {
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
    }


    public void reset(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.putInt(SCORE_TEAM_A, scoreTeamA);
        displayForTeamA(scoreTeamA);
        savedInstanceState.putInt(SCORE_TEAM_B, scoreTeamB);
        displayForTeamB(scoreTeamB);
     }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(SCORE_TEAM_A, scoreTeamA);
        savedInstanceState.putInt(SCORE_TEAM_B, scoreTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }
}
