package com.social.apdn.nasne.profiledialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.social.apdn.nasne.profiledialog.databinding.ActivityMainBinding;
import com.social.apdn.nasne.profiledialogcs.DialogData;
import com.social.apdn.nasne.profiledialogcs.GetUserData;
import com.social.apdn.nasne.profiledialogcs.SocialNasNeDialog;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}