package com.pinkycindy.menghitungluas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tps = (Button) findViewById(R.id.button3);


        tps.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent tpsIntent = new Intent(MainActivity.this, PersegiActivity.class);

                startActivity(tpsIntent);
            }
        });
    }
}
