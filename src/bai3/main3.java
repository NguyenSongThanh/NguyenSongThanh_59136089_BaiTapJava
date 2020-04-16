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
public class main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tao cac sinh vien
        SinhVienPoLy svPoly = new SinhVienIT("Nguyen A","CNTT",6,7,8);
        SinhVienIT svIT = new SinhVienIT( "Nguyen B","CNTT",7,8,9);
        SinhVienBiz svBiz = new SinhVienBiz("Nguyen C","Biz",9,10);
        //Cac ham hien thi thong tin
        svPoly.xuat();
        System.out.println("Diem: " + svPoly.getDiem() + "Hoc luc: " + svPoly.getHocLuc());
        svIT.xuat();
        System.out.println("Diem: " + svIT.getDiem() + "Hoc luc: " + svIT.getHocLuc());
        svBiz.xuat();
        System.out.println("Diem: " + svBiz.getDiem() + "Hoc luc: " + svBiz.getHocLuc());
    }
    
}
