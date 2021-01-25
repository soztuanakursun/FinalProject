package com.example.finalproject;

public class modell {
    String projeaciklama ,Projekategori, Projeisim;

    // Mert    wrote these codes, Modell is means that project models
    public modell() {
    }

    public modell(String projeaciklama, String projekategori, String projeisim) {
        this.projeaciklama = projeaciklama;
        Projekategori = projekategori;
        Projeisim = projeisim;
    }

    public String getProjeaciklama() {
        return projeaciklama;
    }

    public void setProjeaciklama(String projeaciklama) {
        this.projeaciklama = projeaciklama;
    }

    public String getProjekategori() {
        return Projekategori;
    }

    public void setProjekategori(String projekategori) {
        Projekategori = projekategori;
    }

    public String getProjeisim() {
        return Projeisim;
    }

    public void setProjeisim(String projeisim) {
        Projeisim = projeisim;
    }
}



