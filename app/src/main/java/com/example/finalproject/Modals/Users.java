package com.example.finalproject.Modals;

import java.util.HashMap;
import java.util.Map;

public class Users {

    private String resim, isim, meslek, hakkımda, gruplar, projeler;

    public Users() {


    }

    public Users(String resim, String isim, String meslek, String hakkımda, String gruplar, String projeler) {
        this.resim = resim;
        this.isim = isim;
        this.meslek = meslek;
        this.hakkımda = hakkımda;
        this.gruplar = gruplar;
        this.projeler = projeler;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getHakkımda() {
        return hakkımda;
    }

    public void setHakkımda(String hakkimda) {
        this.hakkımda = hakkimda;
    }

    public String getGruplar() {
        return gruplar;
    }

    public void setGruplar(String gruplar) {
        this.gruplar = gruplar;
    }

    public String getProjeler() {
        return projeler;
    }

    public void setProjeler(String projeler) {
        this.projeler = projeler;
    }
}