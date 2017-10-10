package com.example.guest.libs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mPlayMadLibsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayMadLibsButton = (Button) findViewById(R.id.playMadLibsButton);

        mPlayMadLibsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("MainActivity", "hello");
                Intent intent = new Intent(MainActivity.this, FillInActivity.class);
                startActivity(intent);
            }
        });
    }
}
