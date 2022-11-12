package com.sesi6.belajarabstarct;

public abstract class BangunDatar {
    String warna;
    
    String getWarna(){
        return warna;
    }
    
    void setWarna(String warna) {
        this.warna = warna;
    }
    
    abstract float getLuas();
}
