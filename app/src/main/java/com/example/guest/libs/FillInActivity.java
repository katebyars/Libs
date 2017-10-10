package com.example.guest.libs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class FillInActivity extends AppCompatActivity {
    private Button mCreateStoryButton;
    private EditText mNoun1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_in);
        mNoun1 = (EditText) findViewById(R.id.noun1);
        mCreateStoryButton = (Button) findViewById(R.id.createStoryButton);


        @Override
        public void onClick(View v){
            String noun1 = mNoun1.getText().toString();
            Log.d("This is noun one: ", noun1);
            Intent intent = new Intent(FillInActivity.this, StoryActivity.class);
        }
    });
 }
