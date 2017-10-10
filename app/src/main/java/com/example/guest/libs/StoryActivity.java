package com.example.guest.libs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {
    private TextView mNoun1TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent intent = getIntent();
        String noun1 = intent.getStringExtra("noun1");
        mNoun1TextView.setText("Here is noun one: " + noun1);
    }
}
