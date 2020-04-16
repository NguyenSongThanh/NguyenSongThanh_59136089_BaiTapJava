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
public class ChuyenXeNoiThanh extends ChuyenXe{
    public int soTuyen;
    public int soKm;
    //Constructor co tham so
    public ChuyenXeNoiThanh(String a, String b, String c, double d, int e, int f) {
        super(a, b, c, d);
        this.soTuyen = e;
        this.soKm = f;
    }
    //Han hien thi thong tin ghi de len ham hien thi thong tin cua lop cha
    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("So tuyen xe: " + this.soTuyen);
        System.out.println("So km di duoc: " + this.soKm);
    }
}
