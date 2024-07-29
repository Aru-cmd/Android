package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log; // Import Log class
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            // Inflate and get instance of binding
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            // set content view to binding's root
            setContentView(binding.getRoot());
            
            binding.btnProfil.setOnClickListener(v -> {
                Intent i = new Intent(MainActivity.this, yoo.class);
                startActivity(i);
                if(binding.tView.getText().toString().equals("Aru")) {
                    Toast.makeText(this, binding.tView.getText(), Toast.LENGTH_SHORT).show();
                }
            });
            
            binding.card1.setOnClickListener(v -> {
                Intent i = new Intent(this, Activity3.class);
                startActivity(i);    
            });
            
            binding.card2.setOnClickListener(v -> {
                Intent i = new Intent(this, Count.class);
                startActivity(i);    
            });
        } catch (Exception e) {
            Log.e(TAG, "Error in onCreate: ", e);
        }
        
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}