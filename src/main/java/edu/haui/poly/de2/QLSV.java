/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class QLSV {
    private ArrayList<SINHVIEN> list=new ArrayList<>();
    Scanner s=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap n :");
        int n=s.nextInt();
        s.hasNextLine();
       for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            s.nextLine();
            System.out.print("Ho ten: ");
            String hoTen = s.nextLine(); 
           
            System.out.print("Ngay sinh (dd/MM/yyyy): ");
            String ngaySinh = s.nextLine();
            System.out.print("Gioi tinh: ");
            String gioiTinh = s.nextLine();
            System.out.print("CCCD: ");
            String cccd = s.nextLine();
            System.out.print("Ma sinh vien: ");
            String maSinhVien = s.nextLine();
            System.out.print("Nganh nghe: ");
            String nganhNghe = s.nextLine();
            System.out.print("Diem mon 1: ");
            double diemMon1 = s.nextDouble();
            System.out.print("Diem mon 2: ");
            double diemMon2 = s.nextDouble();
            System.out.print("Diem mon 3: ");
            double diemMon3 = s.nextDouble();
            DIEM diem = new DIEM(diemMon1, diemMon2, diemMon3);
            SINHVIEN sv = new SINHVIEN(hoTen, ngaySinh, gioiTinh, cccd, maSinhVien, nganhNghe, diem);
            list.add(sv);
        }
    }
    public void xuat(){
        if (list.isEmpty()) {
            System.out.println("Danh sach sinh vien rong");
        } else {
            System.out.println("Danh sach sinh vien:");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Ho Ten", "Ngay Sinh", "Gioi Tinh", "CCCD", "Ma Sinh Vien", "Nganh Nghe", "Diem TB");
            for (SINHVIEN sv : list) {
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20.2f%n",
                        sv.getHoTen(), sv.getNgaySinh(), sv.getGioiTinh(), sv.getCccd(),
                        sv.getMasv(), sv.getNganhNghe(), sv.getDiem().getDtb());
            }
        }
    }
    public void sapXep(){
        if (list.isEmpty()) {
            System.out.println("Danh sach sinh vien rong");
        } else {
            Collections.sort(list,(a, b) -> (int) (a.getDiem().getDtb()-a.getDiem().getDtb()));
            xuat();
           
       
           
        }
    }
    public void menu(){
        while(true){
            System.out.println("CHUONG TRINH QUAN LY SINH VIEN");
            System.out.println("------------------------------");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Hien thi danh sach");
            System.out.println("3.Sap sep");
            System.out.println("4.Tim kiem");
            System.out.println("Moi ban nhap lua chon :");
            int luaChon=s.nextInt();
            switch (luaChon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sapXep();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
