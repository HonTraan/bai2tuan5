/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinhhoc;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class hinhhocmain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HinhBinhHanh hbh=new HinhBinhHanh(5,3,6);
        hbh.xuatCV();
        hbh.xuatDienTich();
        HinhChuNhat hcn=new HinhChuNhat(6,3);
        hcn.xuatCV();
        hcn.xuatDienTich();
        HinhVuong hv=new HinhVuong(6);
        hv.xuatCV();
        hv.xuatDienTich();
        HinhThoi ht=new HinhThoi(6,4);
        ht.xuatCV();
        ht.xuatDienTich();
    }        
}
