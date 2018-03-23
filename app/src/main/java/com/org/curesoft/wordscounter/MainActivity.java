package com.org.curesoft.wordscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText mEditText;
     TextView mTexview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText= (EditText) findViewById(R.id.editTextCounter);
        mTexview= (TextView) findViewById(R.id.wordCounter);
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
             String text=mEditText.getText().toString();
                text=text.replace("\n"," ");
                String[] textCounter=text.split(" ");
                mTexview.setText("no of words "+textCounter.length);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
