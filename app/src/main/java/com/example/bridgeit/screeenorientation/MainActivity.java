package com.example.bridgeit.screeenorientation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mDisplayName;
    private EditText mEnterName;
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDisplayName = (TextView)findViewById(R.id.text_display);
        mEnterName = (EditText)findViewById(R.id.edit_text);
        mSubmit = (Button)findViewById(R.id.submit);

        //set the text in textView
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayName.setText(mEnterName.getText().toString());
            }
        });
    }

}
