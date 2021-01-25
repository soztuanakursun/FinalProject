package com.example.finalproject;

public class MyGroupsModal {
    private  String groupName;
    private  String groupDes;
    private  String groupMembers;
    // Tuana  wrote these codes

    public MyGroupsModal() {
    }

    public MyGroupsModal(String groupName, String groupDes, String groupMembers) {
        this.groupName = groupName;
        this.groupDes = groupDes;
        this.groupMembers = groupMembers;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDes() {
        return groupDes;
    }

    public void setGroupDes(String groupDes) {
        this.groupDes = groupDes;
    }

    public String getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(String groupMembers) {
        this.groupMembers = groupMembers;
    }
}
