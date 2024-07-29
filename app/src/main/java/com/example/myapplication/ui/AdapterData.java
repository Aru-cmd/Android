package com.example.myapplication.ui;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterData{
    private String nama;
    private int umur;
    
    public AdapterData(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

        public String getNama() {
            return this.nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
        public int getUmur() {
            return this.umur;
        }
        public void setUmur(int umur) {
            this.umur = umur;
        }
}
