package Tuan4.Baitap.Bai1.Model;

import java.util.List;

public class TapPhanSo {
    private List<PhanSo> list;

    public TapPhanSo(List<PhanSo> list) {
        this.list = list;
    }
    
    public PhanSo findMax(){
        PhanSo i = new PhanSo(0,1);
        for(PhanSo it: list){
            if((double) it.getT()/it.getM() > (double) i.getT()/i.getM())
                i = it;
        }
        return i;
    }
    
    public double tong(){
        double tong =0.0;
        for(PhanSo it: list){
            tong += (double) it.getT()/it.getM();
        }
        return tong;
    }
    
    public int demSo(){
        int dem = 0;
        for(PhanSo it: list){
            if((double) it.getT() /it.getM() / (int)it.getT()/it.getM() > 1.0)
                dem++;
        }
        return dem;
    }
}
