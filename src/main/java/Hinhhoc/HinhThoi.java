/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinhhoc;

/**
 *
 * @author ADMIN
 */
public class HinhThoi extends HinhBinhHanh {

    public HinhThoi(double canh,double duongcao) {
        super(canh, canh, duongcao);
    }
    public void xuatCV(){
        System.out.println("Chu vi hinh thoi co canh "+super.getCanh()+" va duong cao "+super.getCao()+" la"+CV());
    }
    public void xuatDienTich(){
        System.out.println("Dien tich hinh thoi la"+DienTich());
    }
}
