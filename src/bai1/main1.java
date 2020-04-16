/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author ST
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nhan vien ko co tham so
        NhanVien nv01 = new NhanVien();
        //NHan vien su dung ham set
        NhanVien nv02 = new NhanVien();
        nv02.setTen("Nguyen A");
        nv02.setTuoi(20);
        nv02.setDiaChi("10/10 ABC");
        nv02.setTienLuong(4000000);
        nv02.setTongSoGioLam(100);
        //Nhan vien co tham so
        NhanVien nv03 = new NhanVien("Nguyen B",30,"20/20 CAB",6000000,80);
        //Hien thi ket qua
        System.out.println(nv01.getThongTin());
        System.out.println(nv02.getThongTin());
        System.out.println(nv03.getThongTin());
    }
    
}
