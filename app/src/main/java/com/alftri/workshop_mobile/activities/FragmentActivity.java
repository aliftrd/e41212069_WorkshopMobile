package com.alftri.workshop_mobile.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.alftri.workshop_mobile.R;
import com.alftri.workshop_mobile.fragments.HomeFragment;
import com.alftri.workshop_mobile.fragments.ProfileFragment;
import com.alftri.workshop_mobile.fragments.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class FragmentActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        bottomNavigationView = findViewById(R.id.bottom_navigation_viwe);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_frame_layout, new HomeFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Integer frameLayout = R.id.fragment_frame_layout;
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(frameLayout, new HomeFragment()).commit();
                return true;
            case  R.id.nav_profile:
                getSupportFragmentManager().beginTransaction().replace(frameLayout, new ProfileFragment()).commit();
                return true;
            default:
                getSupportFragmentManager().beginTransaction().replace(frameLayout, new SettingFragment()).commit();
                return true;
        }
    }
}