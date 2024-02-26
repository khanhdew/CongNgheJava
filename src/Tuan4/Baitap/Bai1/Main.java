package Tuan4.Baitap.Bai1;

import Tuan4.Baitap.Bai1.Model.PhanSo;
import Tuan4.Baitap.Bai1.Model.TapPhanSo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(2,3);
        PhanSo ps2 = new PhanSo(1,4);
        System.out.println(ps1);
        System.out.println(ps2);
        System.out.println("Tong = "+ ps1.tong(ps2));
        System.out.println("Hieu = "+ps1.hieu(ps2));
        System.out.println("Tich = "+ps1.tich(ps2));
        System.out.println("Thuong = "+ps1.thuong(ps2));
        PhanSo ps3 = new PhanSo(2,4);
        System.out.println(ps3);
        ps3.rutGon();
        System.out.println(ps3);
        List<PhanSo> list = new ArrayList<>();
        list.add(ps1);
        list.add(ps2);
        list.add(ps3);
        TapPhanSo tapPhanSo = new TapPhanSo(list);
        PhanSo ps4 = tapPhanSo.findMax();
        System.out.println(ps4.toString());
        System.out.println(tapPhanSo.tong());
        System.out.println(tapPhanSo.demSo());
    }
}
