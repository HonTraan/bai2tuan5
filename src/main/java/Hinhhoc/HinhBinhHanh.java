/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Hinhhoc;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class HinhBinhHanh {
    private double day;
    double canhben;
    private double cao;

    public HinhBinhHanh(double day, double canhben, double cao) {
        this.day = day;
        this.canhben = canhben;
        this.cao = cao;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public double getCanh() {
        return canhben;
    }

    public void setCanh(double canh) {
        this.canhben = canh;
    }

    public double getCao() {
        return cao;
    }

    public void setCao(double cao) {
        this.cao = cao;
    }
    public void Nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap canh day:");
        day=scanner.nextDouble();
        System.out.println("Nhap canh ben:");
        canhben=scanner.nextDouble();
        System.out.println("Nhap duong cao:");
        cao=scanner.nextDouble();
    }
    public double CV(){
        return 2*(day+canhben);
    }
    public double DienTich(){
        return (day*cao);
    }
    public void xuatCV(){
        System.out.println("Chu vi hinh binh hanh co canh day la"+day+"canh ben "+canhben+" va duong cao "+cao+" la:"+CV());
    }
    public void xuatDienTich(){
        System.out.println("Dien tich cua hinh binh hanh la:"+DienTich());
    }
}
