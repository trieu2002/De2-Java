/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeKIemLan2;
import java.io.Serializable;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class Nguoi implements Serializable {
    private String name;
    private String ngaySinh;
    private String diaChi;
    private double chieucao;
    private double mucChi;

    public Nguoi() {
    }

    public Nguoi(String name, String ngaySinh, String diaChi, double chieucao, double mucChi) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chieucao = chieucao;
        this.mucChi = mucChi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double getMucChi() {
        return mucChi;
    }

    public void setMucChi(double mucChi) {
        this.mucChi = mucChi;
    }
    
}
