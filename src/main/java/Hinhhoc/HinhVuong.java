/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinhhoc;

/**
 *
 * @author ADMIN
 */
public class HinhVuong extends HinhChuNhat {

    public HinhVuong(  double canh) {
        super(canh, canh);
    }
    public void xuatCV(){
        System.out.println("Chu vi hinh vuong co canh "+super.getCanh()+" la "+CV());
    }
    public void xuatDienTich(){
        System.out.println("Dien tich hinh vuong la "+DienTich());
    }
}
