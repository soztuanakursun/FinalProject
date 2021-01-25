package com.example.finalproject;

public class projectModels {

// Bu kodlar en güncel ve en son tesst edilen kodlarıdır. Hepsi çalışyor
    //Mert wrote these codes
    String ProjectName, PojectCat ,ProjectDesc;


    public projectModels() {
    }

    public projectModels(String projectName, String pojectCat, String projectDesc) {
        ProjectName = projectName;
        PojectCat = pojectCat;
        ProjectDesc = projectDesc;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getPojectCat() {
        return PojectCat;
    }

    public void setPojectCat(String pojectCat) {
        PojectCat = pojectCat;
    }

    public String getProjectDesc() {
        return ProjectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        ProjectDesc = projectDesc;
    }
}
