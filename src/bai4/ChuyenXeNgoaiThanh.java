/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author ST
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    public String noiDen;
    public int soNgayDiDuoc;
    //ConStructor co tham so
    public ChuyenXeNgoaiThanh(String a, String b, String c, double d, String e, int f) {
        super(a, b, c, d);
        this.noiDen = e;
        this.soNgayDiDuoc = f;
    }
    //Ham httt ke thua tu lop cha
    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Noi den: " + this.noiDen);
         System.out.println("So Ngay Di Duoc: " + this.soNgayDiDuoc);
    } 
}
