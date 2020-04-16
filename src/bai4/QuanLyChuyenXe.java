/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;

/**
 *
 * @author ST
 */
public class QuanLyChuyenXe {
    public ArrayList<ChuyenXe> dsCX = new ArrayList<>();
    //Cac phuong thuc
    public void themCX(ChuyenXe a)
    {
        dsCX.add(a);
    }
    public void xuatCX()
    {
        for(int i=0; i < dsCX.size(); i++)
            dsCX.get(i).xuat();
    }
    //Cac ham tinh doanh thu
    public double tongDoanhThuNoiThanh()
    {
        double sum = 0;
        for(ChuyenXe a : dsCX)
        {
            if(a instanceof ChuyenXeNoiThanh)
                sum += a.doanhThu;
        }
        return sum;
    }
    public double tongDoanhThuNgoaiThanh()
    {
        double sum = 0;
        for(ChuyenXe a : dsCX)
        {
            if(a instanceof ChuyenXeNgoaiThanh)
                sum += a.doanhThu;
        }
        return sum;
    }
    public double tongDoanhThuCacChuyenXe()
    {
        double sum = 0;
        for(ChuyenXe a : dsCX)
            sum += a.doanhThu;
        return sum;
    }
}
