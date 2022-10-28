package com.school.app.schoolproject.data;

public class student {
    private long idnum;
    private String name;
    private String address;
    private int phonenum;
    private static long idnumcounter = 0;

    public student() {
        this("");
    }
    public student(String name){
        this.idnum = idnumcounter++;
    }
    
    
    public student(String name, String address, int phonenum) {
        this.idnum = idnumcounter++;
        this.name = name;
        this.address = address;
        this.phonenum = phonenum;
    }

    public long getIdnum() {
        return this.idnum;
    }

    public void setIdnum(long idnum) {
        this.idnum = idnum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonenum() {
        return this.phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

}
