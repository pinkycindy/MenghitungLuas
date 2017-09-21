package com.pinkycindy.menghitungluas;

import android.os.StrictMode;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {

    private TextInputLayout mTextInputLayoutRadius;
    private EditText mEditTextRadius;
    private TextView mTextViewHasilLingkaran;
    private Button mBtnLingkaranProcess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        mTextInputLayoutRadius = (TextInputLayout) findViewById(R.id.radius_til);
        mEditTextRadius = (EditText) findViewById(R.id.radius_et);
        mTextViewHasilLingkaran = (TextView) findViewById(R.id.hasil_lingkaran_tv);
        mBtnLingkaranProcess = (Button) findViewById(R.id.lingkaran_process_btn);

        // Hitung luas
        mBtnLingkaranProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double r = Double.parseDouble(mEditTextRadius.getText().toString());
                Double hasil = 3.14 * r * r;
                String hasilTxt = String.valueOf(hasil);

                mTextViewHasilLingkaran.setText(hasilTxt);
            }
        });

    }
}
