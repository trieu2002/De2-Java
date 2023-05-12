/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de2;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class DIEM {
    private double diem1;
    private  double diem2;
    private double  diem3;
    private double dtb;

    public DIEM(double diem1, double diem2, double diem3) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.dtb = (diem1+diem2+diem3)/3;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    
}
