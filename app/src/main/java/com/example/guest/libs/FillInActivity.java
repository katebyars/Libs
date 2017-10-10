package com.example.guest.libs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;

public class FillInActivity extends AppCompatActivity {
    private Button mCreateStoryButton;
    @Bind(R.id.noun1) TextView mNoun1;
    @Bind(R.id.location2) TextView mLocation2;
    @Bind(R.id.object1) TextView mObject1;
    @Bind(R.id.object2) TextView mObject2;
    @Bind(R.id.adjective1) TextView mAdjective1;
    @Bind(R.id.actionword1) TextView mActionword1;
    @Bind(R.id.largeflatobject) TextView mLargeflatobject;
    @Bind(R.id.kindofdwelling) TextView mKindofdwelling;
    @Bind(R.id.bodypart) TextView mBodypart;
    @Bind(R.id.occupation) TextView mOccupation;
    @Bind(R.id.food1) TextView mFood1;
    @Bind(R.id.food2) TextView mFood2;
    @Bind(R.id.createStoryButton) Button getmCreateStoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_in);
        ButterKnife.bind(this);

        mCreateStoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noun1 = mNoun1.getText().toString();
                String location2 = mLocation2.getText().toString();
                String object1 = mNoun1.getText().toString();
                String object2 = mNoun1.getText().toString();
                String adjective1 = mNoun1.getText().toString();
                String adjective2 = mNoun1.getText().toString();
                String actionword1 = mNoun1.getText().toString();
                String largeflatobject = mNoun1.getText().toString();
                String kindofdwelling = mNoun1.getText().toString();
                String bodypart = mNoun1.getText().toString();
                String occupation = mNoun1.getText().toString();
                String food1 = mNoun1.getText().toString();
                String food2 = mNoun1.getText().toString();

                Intent intent = new Intent(FillInActivity.this, StoryActivity.class);
                intent.putExtra("noun1", noun1);
                intent.putExtra("location2",location2);
                intent.putExtra("object1", object1);
                intent.putExtra("object2", object2);
                intent.putExtra("adjective1", adjective1);
                intent.putExtra("actionword1", actionword1);
                intent.putExtra("largeflatobject", largeflatobject);
                intent.putExtra("kindofdwelling", kindofdwelling);
                intent.putExtra("bodypart", bodypart);
                intent.putExtra("occupation", occupation);
                intent.putExtra("food1", food1);
                intent.putExtra("food2", food2);
                startActivity(intent);
            }
        });
    }
}
