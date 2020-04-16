/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import bai1.NhanVien;

/**
 *
 * @author ST
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Tao mot bien quan ly nhan vien
       IQuanLy quanLylNV = new QuanLyNhanVien();
       //Tao cac nhan vien
       NhanVien nv01 = new NhanVien();
       nv01.setTen("Nguyen A");
       nv01.setTuoi(10);
       nv01.setDiaChi("10/10 ABC");
       nv01.setTienLuong(3000000);
       nv01.setTongSoGioLam(100);
       
       NhanVien nv02 = new NhanVien();
       nv02.setTen("Nguyen B");
       nv02.setTuoi(20);
       nv02.setDiaChi("20/20 CBA");
       nv02.setTienLuong(4000000);
       nv02.setTongSoGioLam(140);
       
       NhanVien nv03 = new NhanVien();
       nv03.setTen("Nguyen C");
       nv03.setTuoi(25);
       nv03.setDiaChi("30/30 GBF");
       nv03.setTienLuong(5000000);
       nv03.setTongSoGioLam(100);
       
       NhanVien nv04 = new NhanVien();
       nv04.setTen("Nguyen D");
       nv04.setTuoi(35);
       nv04.setDiaChi("40/40 UHG");
       nv04.setTienLuong(40000000);
       nv04.setTongSoGioLam(300);
       
       NhanVien nv05 = new NhanVien();
       nv05.setTen("Nguyen E");
       nv05.setTuoi(33);
       nv05.setDiaChi("50/50 HGJ");
       nv05.setTienLuong(3000000);
       nv05.setTongSoGioLam(50);
       //Them cac nhan vien vao danh sach
       quanLylNV.them(nv01);
       quanLylNV.them(nv02);
       quanLylNV.them(nv03);
       quanLylNV.them(nv04);
       quanLylNV.them(nv05);
       //Hien thi thong tin ra man hinh
       quanLylNV.inDS();
    }
    
}
