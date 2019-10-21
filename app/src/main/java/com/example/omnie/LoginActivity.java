package com.example.omnie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FragmentManager fragmentManager =getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .add(R.id.main_layout,new LoginiiFragment(),"Aktiviteti")
                .commit();

//
    }
}
