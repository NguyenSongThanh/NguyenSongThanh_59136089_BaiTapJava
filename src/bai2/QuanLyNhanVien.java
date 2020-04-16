/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import bai1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author ST
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> danhSachNV = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
         danhSachNV.add(nv);
    }

    @Override
    public void inDS() {
         for(int i=0; i< danhSachNV.size(); i++)
            System.out.println("Nhan vien thu " + (i+1) + danhSachNV.get(i).getThongTin());
    }
    
}
