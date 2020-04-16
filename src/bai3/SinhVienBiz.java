/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author ST
 */
public class SinhVienBiz extends SinhVienPoLy{
    public double diemMarketing;
    public double diemSales;
    //Constructor co tham so
    public SinhVienBiz(String a, String b, double g, double h) {
        super(a, b); //Cac thuoc tinh ke thua ben lop cha
        this.diemMarketing = g;
        this.diemSales = h;
    }
   //Tuong tu nhu ben SVIT 
    @Override
    public double getDiem() {
        return (2*this.diemMarketing + this.diemSales)/3;
    }
}
