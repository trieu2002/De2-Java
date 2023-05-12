/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de2;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class SINHVIEN extends NGUOI{
    private String masv;    
    private String nganhNghe;
    private DIEM diem;
    public SINHVIEN(String hoTen, String ngaySinh, String gioiTinh, String cccd,String masv,String nganhNghe,DIEM diem) {
        super(hoTen, ngaySinh, gioiTinh, cccd);
        this.masv=masv;
        this.nganhNghe=nganhNghe;
        this.diem=diem;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }

    public void setNganhNghe(String nganhNghe) {
        this.nganhNghe = nganhNghe;
    }

    public DIEM getDiem() {
        return diem;
    }

    public void setDiem(DIEM diem) {
        this.diem = diem;
    }
    
}
