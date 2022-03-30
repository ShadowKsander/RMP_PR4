package com.example.rmp_pr4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.ContentValues;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null) {
            mCurrentScore = savedInstanceState.getInt(STATE_SCORE);
            mCurrentLevel = savedInstanceState.getInt(STATE_LEVEL);
        }
    }

    static final String STATE_SCORE = "PlayerScore";
    static final String STATE_LEVEL = "PlayerLevel";
    static int mCurrentScore;
    static int mCurrentLevel;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_SCORE, mCurrentScore);
        savedInstanceState.putInt(STATE_LEVEL, mCurrentLevel);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    protected void onStop() {
        super.onStop();
        ContentValues values = new ContentValues();
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onRestart() {
        super.onRestart();
    }

    public void onDestroy() {
        super.onDestroy();
        android.os.Debug.stopMethodTracing();
    }

}

