package com.alftri.workshop_mobile.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alftri.workshop_mobile.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_mahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_mahasiswa = findViewById(R.id.btn_mahasiswa);
        btn_mahasiswa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
         switch (v.getId()){
             case R.id.btn_mahasiswa :
                 Intent mhsIntent = new Intent(MainActivity.this, ListMahasiswaActivity.class);
                 startActivity(mhsIntent);
                break;
             default:
                 return;
         }
    }
}