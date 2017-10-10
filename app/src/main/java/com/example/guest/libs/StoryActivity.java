package com.example.guest.libs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StoryActivity extends AppCompatActivity {
    private TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        mStoryTextView = (TextView) findViewById(R.id.story);
        Intent intent = getIntent();
        String noun1 = intent.getStringExtra("noun1");
        String location2 = intent.getStringExtra("location2");
        String object1 = intent.getStringExtra("object1");
        String object2 = intent.getStringExtra("object2");
        String adjective1 = intent.getStringExtra("adjective1");
        String actionword1 = intent.getStringExtra("actionword1");
        String largeflatobject = intent.getStringExtra("largeflatobject");
        String kindofdwelling = intent.getStringExtra("kindofdwelling");
        String bodypart = intent.getStringExtra("bodypart");
        String occupation = intent.getStringExtra("occupation");
        String food1 = intent.getStringExtra("food1");
        String food2 = intent.getStringExtra("food2");

        mStoryTextView.setText (String.format("Little Red Riding %s went to the %s to visit her ill granny. She took some %s and %s in a basket. She met a %s wolf that asked her which path she was taking. She replied, I am taking the path that leads to my granny's cottage. While she was busy picking flowers to take to her granny, the wolf went to the cottage and swallowed granny in one %s. Then the wolf put on granny's cap, got in granny's bed, covered up in %s, and settled in to wait. Little Red Riding arrived at the cottage and came into granny's %s. She said, 'Granny what big ears you have!', and the wolf replied 'All the better to hear you with, my dear'. And so on with Granny's eyes: All the better to see you with, my dear, and so on with her %s all the better to eat you with, my dear. The wolf swallowed the poor girl in one gulp and then fell asleep. A %s came by while the wolf was still asleep. He cut the wolf open with his ax and out popped Granny and the girl. Then the woodsman, Granny, and the child all sat down by the fire and enjoyed %s and %s.", noun1, location2, object1, object2, adjective1, actionword1, largeflatobject, kindofdwelling, bodypart, occupation, food1, food2));
    }
}
