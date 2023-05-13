/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de5;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class KHACHHANG extends NGUOI {
    private  String id;
    private double tiLe;
    public KHACHHANG(String hoTen, String cccd,String id,double  tiLe) {
        super(hoTen, cccd);
        this.id=id;
        this.tiLe=tiLe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTiLe() {
        return tiLe;
    }

    public void setTiLe(double tiLe) {
        this.tiLe = tiLe;
    }
    
}
