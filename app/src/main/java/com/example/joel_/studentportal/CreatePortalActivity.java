package com.example.joel_.studentportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreatePortalActivity extends AppCompatActivity {

    protected String mUrlText, mNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_portal);

        //Get all the objects
        final EditText mUrlButton = findViewById((R.id.urlText));
        final EditText mNameButton = findViewById((R.id.nameText));
        final Button mConfirmButton = findViewById(R.id.addPortalButton);

        mConfirmButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mUrlText = mUrlButton.getText().toString();
                mNameText = mNameButton.getText().toString();

                Intent intent = new Intent(CreatePortalActivity.this, MainActivity.class);
                intent.putExtra("newURL", mUrlText);
                intent.putExtra("newName", mNameText);

                startActivity(intent);
            }
        });
    }


}
