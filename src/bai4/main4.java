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
public class main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tao bien quan ly chuyen xe
        QuanLyChuyenXe quanLyCX = new QuanLyChuyenXe();
        //Tao cac bien chuyeen xe noi thanh
        ChuyenXe cxnt1 = new ChuyenXeNoiThanh("0001","Pham A","NT01",400000,30,50);
        ChuyenXe cxnt2 = new ChuyenXeNoiThanh("0002","Pham B","NT02",500000,40,50);
        ChuyenXe cxnt3 = new ChuyenXeNoiThanh("0003","Pham C","NT03",300000,50,30);
        //Tao cac bien chuyen xe ngoai thanh
        ChuyenXe cxngt1 = new ChuyenXeNgoaiThanh("1001","Tran A","NGT01",300000,"PY-HCM",2);
        ChuyenXe cxngt2 = new ChuyenXeNgoaiThanh("1002","Tran B","NGT02",400000,"HN-NT",3);
        ChuyenXe cxngt3 = new ChuyenXeNgoaiThanh("1003","Tran C","NGT03",500000,"NT-CR",1);
        //Them cac bien da tao vao danh sach
        quanLyCX.themCX(cxnt1);
        quanLyCX.themCX(cxnt2);
        quanLyCX.themCX(cxnt3);
        quanLyCX.themCX(cxngt1);
        quanLyCX.themCX(cxngt2);
        quanLyCX.themCX(cxngt3);
        //Hien thi thong tin cac chuyen xe
        quanLyCX.xuatCX();
        //Hien thi tong doanh thu
        System.out.println("Tong doanh thu noi thanh: " + quanLyCX.tongDoanhThuNoiThanh());
        System.out.println("Tong doanh thu ngoai thanh: " + quanLyCX.tongDoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu cac chuyen xe: " + quanLyCX.tongDoanhThuCacChuyenXe());
    }
    
}
