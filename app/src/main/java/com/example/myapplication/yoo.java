package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.databinding.YooBinding;

public class yoo extends AppCompatActivity {
    private YooBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        binding = YooBinding.inflate(getLayoutInflater());
        
        setContentView(binding.getRoot());
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // TODO: Implement this method
        this.binding = null;
    }
    
}
