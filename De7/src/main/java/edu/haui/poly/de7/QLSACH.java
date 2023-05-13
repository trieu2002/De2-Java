/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de7;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class QLSACH {
    private ArrayList<SACH_IT> list=new ArrayList<>();
    private  ArrayList<SACH_IT> list2=new ArrayList<>();
    Scanner s=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap n:");
        int n=s.nextInt();
        s.hasNextLine();
        for(int i=0;i<n;i++){
           System.out.println("Nhap thong tin sach thu " +(i+1) +" :");
          s.nextLine();
         System.out.println("Nhap ten sach :");
        String tenSach=s.nextLine();
        System.out.println("Nhap id :");
       String id=s.nextLine();
        System.out.println("Nhap ho ten :");
        String hoTen=s.nextLine();
        System.out.println("Nhap email :");
        String email=s.nextLine();
        System.out.println("Nhap gt :");
        String gioiTinh=s.nextLine();
        System.out.println("Nhap so luong :");
        int qty=s.nextInt();
        System.out.println("Nhap nam xb :");
        int nxb=s.nextInt();
        TACGIA tg=new TACGIA(hoTen,email,gioiTinh);
        SACH_IT it=new SACH_IT(tenSach, id, qty, nxb, tg);
        list.add(it);
        }
    }
    public void xuat() {
    System.out.println("Danh sach sach ");
    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Ten sach", "ID", "Ho Ten", "Email", "Gioi Tinh", "So luong","Nam XB");

    for (SACH_IT item : list) {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20d%-20d%n",
            item.getTenSach(), item.getId(), item.getTacgia().getHoTen(),
            item.getTacgia().getEmail(), item.getTacgia().getGioiTinh(), item.getQty(), item.getNxb());
    } 
}
 public void timKiem(){
     System.out.println("Nhap id :");
     String id=s.nextLine();
     for(SACH_IT item:list){
         if(item.getId().equals(id)){
             list2.add(item);
         }
     }
 }
 public void xuatTimKiem(){
     if(list2.isEmpty()){
         System.out.println("Danh sach rong");
     }else{
          System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Ten sach", "ID", "Ho Ten", "Email", "Gioi Tinh", "So luong","Nam XB");

    for (SACH_IT item : list2) {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20d%-20s%n",
            item.getTenSach(), item.getId(), item.getTacgia().getHoTen(),
            item.getTacgia().getEmail(), item.getTacgia().getGioiTinh(), item.getQty(), item.getNxb());
    } 
     }
 }
 public void menu(){
        while(true){
            System.out.println("CHUONG TRINH QUAN LY SACH");
            System.out.println("----------------------------");
            System.out.println("1.Nhap");
            System.out.println("2.Hien thi");
            System.out.println("3.Tim Kiem");
            System.out.println("4.Thoat");
            System.out.println("Moi ban nhap lua chon :");
            int chon=s.nextInt();
            s.nextLine();
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
