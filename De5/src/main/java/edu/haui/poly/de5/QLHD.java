/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de5;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class QLHD {
    private ArrayList<HOADON> list=new ArrayList<>();
    private ArrayList<HOADON> list2=new ArrayList<>();
    Scanner s=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap n :");
        int n=s.nextInt();
       s.hasNextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin hoa don thu " +(i+1) +" :");
            s.nextLine();
            System.out.println("Nhap ho ten :");
            String hoTen=s.nextLine();
            System.out.println("Nhap cccd :");
              String cccd=s.nextLine();
       
     
            System.out.println("Nhap ma hoa don :");
            String ma=s.nextLine();
            System.out.println("Nhap so luong :");
            int qty=s.nextInt();
            s.nextLine();
           System.out.println("Nhap id khach hang :");
        String id=s.nextLine();
        System.out.println("nhap ti le :");
        double tiLe=s.nextDouble();
        KHACHHANG kh=new KHACHHANG(hoTen,cccd,id,tiLe);
        HOADON hd=new HOADON(ma,qty,kh);
        list.add(hd);
        }
    }
    public void xuat() {
    System.out.println("Danh sach hoa don ");
    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%n", "Ho Ten", "CCCD", "Ma hoa don", "So Luong", "Id", "Ti le");

    for (HOADON item : list) {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%.2f%n",
            item.getKhachHang().getHoTen(), item.getKhachHang().getCccd(), item.getMaHoaDon(),
            item.getQty(), item.getKhachHang().getId(), item.getKhachHang().getTiLe());
    }
}

    public void timKiem(){
        System.out.println("Nhap so luong tim kiem :");
        int qty=s.nextInt();
        for(HOADON item:list){
            if(item.getQty()==qty){
                list2.add(item);
            }
        }
    }
    public void xuatTimKiem(){
        if(list2.isEmpty()){
            System.out.println("Danh sach khong tim thay");
        }else{
            for(HOADON item:list) {
           System.out.printf("%-20s%-20s%-20s%-20s%-20s%.2f%n",
        item.getKhachHang().getHoTen(), item.getKhachHang().getCccd(), item.getMaHoaDon(),
        item.getQty(), item.getKhachHang().getId(), item.getKhachHang().getTiLe());
      }

        } 
        
    }
    public void menu(){
        while(true){
            System.out.println("CHUONG TRINH QUAN LY HOA DON");
            System.out.println("----------------------------");
            System.out.println("1.Nhap");
            System.out.println("2.Hien thi");
            System.out.println("3.Tim Kiem");
            System.out.println("4.Thoat");
            System.out.println("Moi ban nhap lua chon :");
            int chon=s.nextInt();
            switch(chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timKiem();
                    xuatTimKiem();
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
