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
public abstract class SinhVienPoLy {
    public String hoTen;
    public String nganhHoc;
    //Constructor co tham so
    public SinhVienPoLy(String a, String b)
    {
        this.hoTen = a;
        this.nganhHoc = b;
    }
    //Chua biet sinh vien hoc nhung mon gi nen getDiem la ham truu tuong
    public abstract double getDiem();
    //Cac phuong thuc
    public String getHocLuc()
    {
        if(this.getDiem() < 5)
            return "Hoc luc yeu";
        else if(this.getDiem() < 6.5)
            return "Hoc luc trung binh";
        else if(this.getDiem() < 7.5)
            return "Hoc luc kha";
        else if(this.getDiem() < 9)
            return "Hoc luc gioi";
        else
            return "Hoc luc xuat sac";
    }
    //Ham hien thi thong tin
    public void xuat()
    {
        System.out.println("Ho va ten: " + this.hoTen + "\nNganh hoc: " + this.nganhHoc);
    }
}
