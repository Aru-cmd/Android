package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.databinding.LayoutHasilBinding;

public class Hasil extends AppCompatActivity {
    private LayoutHasilBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = LayoutHasilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        String uname = getIntent().getExtras().getString("username");
        String passwd = getIntent().getExtras().getString("passwd");
        
        binding.hasil.setText("Halo " + uname + " passwd nya " + passwd);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // TODO: Implement this method
        binding = null;
    }
    
}
