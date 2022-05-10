package com.example.caller991;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.caller991.databinding.ActivityContactsBinding;

public class ContactsActivity extends AppCompatActivity {

     private ActivityContactsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_contacts);
        binding=ActivityContactsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}