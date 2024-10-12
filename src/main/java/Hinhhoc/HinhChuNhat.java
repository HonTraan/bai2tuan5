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
public class HinhChuNhat extends HinhBinhHanh {

    public HinhChuNhat(double dai, double rong) {
        super(dai, rong, rong);
    }
    public void xuatCV(){
        System.out.println("Chu vi hinh chu nhat co chieu dai"+super.getDay()+" va chieu rong "+super.getCanh()+" la"+CV());
    }
    public void xuatDienTich(){
        System.out.println("Dien tich hinh chu nhat la:"+DienTich());
    }
}
