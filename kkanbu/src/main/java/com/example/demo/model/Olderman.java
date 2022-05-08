package com.example.demo.model;

import java.util.List;
import java.util.Map;

public class Olderman {
    private int manId;
    private String manName;
    private String manPh;
    private String manAdr;

    private int mangerGroupId;
//    private Map<String,String> manManagerList;
    private String manManager;
    private String manManagerPh;
    private String manGender;
    private String manIllness;


    public Olderman() {
        super();
    }


    public int getManId() {
        return manId;
    }

    public void setManId(int manId) {
        this.manId = manId;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public String getManPh() {
        return manPh;
    }

    public void setManPh(String manPh) {
        this.manPh = manPh;
    }

    public String getManAdr() {
        return manAdr;
    }

    public void setManAdr(String manAdr) {
        this.manAdr = manAdr;
    }

    public String getManManager() {
        return manManager;
    }

    public void setManManager(String manManager) {
        this.manManager = manManager;
    }

    public String getManManagerPh() {
        return manManagerPh;
    }

    public void setManManagerPh(String manManagerPh) {
        this.manManagerPh = manManagerPh;
    }

    public String getManGender() {
        return manGender;
    }

    public void setManGender(String manGender) {
        this.manGender = manGender;
    }

    public String getManIllness() {
        return manIllness;
    }

    public void setManIllness(String manIllness) {
        this.manIllness = manIllness;
    }

    public int getMangerGroupId() {
        return mangerGroupId;
    }

    public void setMangerGroupId(int mangerGroupId) {
        this.mangerGroupId = mangerGroupId;
    }

    @Override
    public String toString() {
        return "Olderman{" +
                "manId=" + manId +
                ", manName='" + manName + '\'' +
                ", manPh='" + manPh + '\'' +
                ", manAdr='" + manAdr + '\'' +
                ", mangerGroupId=" + mangerGroupId +
                ", manManager='" + manManager + '\'' +
                ", manManagerPh='" + manManagerPh + '\'' +
                ", manGender='" + manGender + '\'' +
                ", manIllness='" + manIllness + '\'' +
                '}';
    }
}
