package com.pinkycindy.menghitungluas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Pinky Cindy on 09/22/17.
 */

public class PersegiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);


        Button hitung = (Button) findViewById(R.id.button4);
        hitung.setOnClickListener(new View.OnClickListener(){
            EditText sisi = (EditText) findViewById(R.id.editText3);
            EditText hasil = (EditText) findViewById(R.id.editText);
            public  void onClick(View view){
                int pjgSisi = Integer.parseInt(sisi.getText().toString());
                int luas = pjgSisi * pjgSisi;
                hasil.setText(String.valueOf(luas));

            }
        });
    }
}
