package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.databinding.LayoutCountBinding;

public class Count extends AppCompatActivity {
    private LayoutCountBinding binding;
    private int nilai = 0;
    private Handler handler = new Handler(Looper.getMainLooper());
    private Runnable running;
    private boolean ditekan = false;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        binding = LayoutCountBinding.inflate(getLayoutInflater());
        
        setContentView(binding.getRoot());
        
        binding.tambah.setOnClickListener(v -> {
            incrementBtn();
        });
        binding.kurang.setOnClickListener(v -> {
            decrementBtn();
            Log.e("test", "percobaan");
        });
        binding.tambah.setOnLongClickListener(v -> {
            startInc();
            return true;
        });
        
        binding.tambah.setOnTouchListener((v,e) -> {
            if(e.getAction() == MotionEvent.ACTION_UP || e.getAction() == MotionEvent.ACTION_CANCEL) {
                stopInc();
            }
            return false;
        });
    }
    
    public void updateIncrement(){
        binding.hasil.setText(String.valueOf(nilai));
    }
    
    public void incrementBtn() {
        nilai++;
        updateIncrement();
    }
    
    public void decrementBtn() {
        nilai--;
        updateIncrement();
    }
    
    public void startInc() {
        if(!ditekan) {
            ditekan = true;
            running = new Runnable() {
                @Override
                public void run() {
                    incrementBtn();
                    
                    handler.postDelayed(this, 100);
                }
            };
            handler.post(running);
        }
    }
    
    public void stopInc() {
        if(ditekan) ditekan = false;
        handler.removeCallbacks(running);
    }
    
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // TODO: Implement this method
        binding = null;
    }
    
}
