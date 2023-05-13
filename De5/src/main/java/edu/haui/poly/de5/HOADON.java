/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de5;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class HOADON {
    private String maHoaDon;
    private int qty;
    private KHACHHANG khachHang;

    public HOADON(String maHoaDon, int qty, KHACHHANG khachHang) {
        this.maHoaDon = maHoaDon;
        this.qty = qty;
        this.khachHang = khachHang;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public KHACHHANG getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KHACHHANG khachHang) {
        this.khachHang = khachHang;
    }
    
}
