package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.databinding.LayoutActivity3Binding;

public class Activity3 extends AppCompatActivity {
    private LayoutActivity3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        binding = LayoutActivity3Binding.inflate(getLayoutInflater());
        
        setContentView(binding.getRoot());
        
        binding.submitBtn.setOnClickListener(v -> {
            Intent i = new Intent(this, Hasil.class);
            i.putExtra("username", binding.inputUsername.getText().toString());
            i.putExtra("passwd", binding.inputPasswd.getText().toString());
            startActivity(i);
        });
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
    
}
