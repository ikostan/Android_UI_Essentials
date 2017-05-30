package com.example.uiessentials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnChangeTxt;
    private TextView txtHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHeader = (TextView) findViewById(R.id.txtHeader); //Text field
        txtHeader.setText("Hello World!");
        btnChangeTxt = (Button) findViewById(R.id.btnChangeTxt); //Button

        //Event listener
        btnChangeTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtHeader.getText() == "Hello World!"){
                    txtHeader.setText("New Text!"); //reverse to original text
                    Log.d("onClick method called", "New Text!"); //Log
                }
                else{
                    txtHeader.setText("Hello World!"); //reverse to original text
                    Log.d("onClick method called", "Hello World!"); //Log
                }
            }
        });
    }

    //END
}
