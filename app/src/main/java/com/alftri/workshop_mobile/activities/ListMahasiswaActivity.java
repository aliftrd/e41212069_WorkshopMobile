package com.alftri.workshop_mobile.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.alftri.workshop_mobile.R;
import com.alftri.workshop_mobile.adapters.MahasiswaAdapter;
import com.alftri.workshop_mobile.models.MahasiswaModel;

import java.util.ArrayList;

public class ListMahasiswaActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<MahasiswaModel> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mahasiswa);

        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);

        students.addAll(getStudents());
        showRecyclerList();
    }

    public ArrayList<MahasiswaModel> getStudents() {
        ArrayList<MahasiswaModel> datas = new ArrayList<>();
        students.add(new MahasiswaModel("E41212069", "Alif Triadi", "aliftriadi.gaming@gmail.com"));
        students.add(new MahasiswaModel("E41212070", "Orchi No Sekai", "orchi.gaming@gmail.com"));

        return datas;
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(students);
        recyclerView.setAdapter(mahasiswaAdapter);
    }
}