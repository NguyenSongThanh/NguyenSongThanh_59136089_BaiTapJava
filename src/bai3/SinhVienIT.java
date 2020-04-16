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
public class SinhVienIT extends SinhVienPoLy{
    public double diemJava;
    public double diemCss;
    public double diemHtml;
    //Constructor co tham so
    public SinhVienIT(String a, String b, double c, double d, double e) {
        super(a, b); // Ke thua cac thuoc tinh ben lop cha
        this.diemJava = c;
        this.diemCss = d;
        this.diemHtml = e;
    }
    //Ham getDiem cua lop SVIT ghi de len GetDiem cua lop SVPOLY vi day la lop ke thua
    @Override
    public double getDiem() {
        return (2*this.diemJava + this.diemCss + this.diemHtml)/4;
    }
}
