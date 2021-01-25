package com.example.finalproject;

public class model {

    String GroupBaslik,GroupAcik;

    // Mert    wrote these codes, model.java is means that Groups model
    public model() {
    }

    public model(String groupBaslik, String groupAcik) {
        GroupBaslik = groupBaslik;
        GroupAcik = groupAcik;
    }


    public String getGroupBaslik() {
        return GroupBaslik;
    }

    public void setGroupBaslik(String groupBaslik) {
        GroupBaslik = groupBaslik;
    }

    public String getGroupAcik() {
        return GroupAcik;
    }

    public void setGroupAcik(String groupAcik) {
        GroupAcik = groupAcik;
    }
}
