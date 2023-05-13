/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de7;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class SACH_IT extends SACH {
   private  TACGIA tacgia;
   private int nxb;
   private int qty;
    public SACH_IT(String tenSach, String id,int qty,int nxb,TACGIA tacGia) {
        super(tenSach, id);
        this.tacgia=tacGia;
        this.nxb=nxb;
        this.qty=qty;
    }

    public TACGIA getTacgia() {
        return tacgia;
    }

    public void setTacgia(TACGIA tacgia) {
        this.tacgia = tacgia;
    }

    public int getNxb() {
        return nxb;
    }

    public void setNxb(int nxb) {
        this.nxb = nxb;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
