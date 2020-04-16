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
public abstract class ChuyenXe{
    public String maSoChuyen;
    public String hoTenTaiXe;
    public String soXe;
    public double doanhThu;
    //Constructor co tham so
    public ChuyenXe(String a, String b, String c, double d)
    {
        this.maSoChuyen = a;
        this.hoTenTaiXe = b;
        this.soXe = c;
        this.doanhThu = d;
    }
    //Ham hien thi thong tin
     public void xuat()
    {
         System.out.println("Ma so chuyen xe: " + this.maSoChuyen); 
         System.out.println("Ho va ten tai xe: " + this.hoTenTaiXe);
         System.out.println("So xe: "+ this.soXe);
         System.out.println("Doanh thu: " + this.doanhThu);
    }
}
