package com.alftri.workshop_mobile.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alftri.workshop_mobile.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_mahasiswa, btn_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_mahasiswa = findViewById(R.id.btn_mahasiswa);
        btn_mahasiswa.setOnClickListener(this);

        btn_fragment = findViewById(R.id.btn_fragment);
        btn_fragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

         switch (v.getId()){
             case R.id.btn_mahasiswa :
                 Intent listMahasiswaActivity = new Intent(MainActivity.this, ListMahasiswaActivity.class);
                 startActivity(listMahasiswaActivity);
                break;
             case R.id.btn_fragment:
                 Intent fragmentActivity = new Intent(MainActivity.this, FragmentActivity.class);
                 startActivity(fragmentActivity);
             default:
                 return;
         }
    }
}