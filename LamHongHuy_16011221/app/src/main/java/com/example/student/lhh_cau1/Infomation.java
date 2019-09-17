package com.example.student.lhh_cau1;

public class Infomation {
    private int ava;
    private String name;
    private int birthYear;
    private int pic;

    public Infomation(int ava, String name, int birthYear, int pic) {
        this.setAva(ava);
        this.setName(name);
        this.setBirthYear(birthYear);
        this.setPic(pic);
    }


    public int getAva() {
        return ava;
    }

    public void setAva(int ava) {
        this.ava = ava;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
