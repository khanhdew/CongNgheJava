package Tuan4.Baitap.Bai2;

import Tuan4.Baitap.Bai2.Model.SoPhuc;

public class Main {
    public static void main(String[] args) {
        // Tao so phuc
        SoPhuc sp1 = new SoPhuc(1.0f, -1.0f);
        SoPhuc sp2 = new SoPhuc(2.4f, 2.0f);
        SoPhuc[] soPhucs = {sp1, sp2};

        // In danh sach
        for (SoPhuc sp : soPhucs) {
            System.out.println(sp.toString());
        }

        // Tinh trung binh so phuc
        SoPhuc temp = new SoPhuc(0.0f, 0.0f);
        for (int i = 0; i < soPhucs.length; i++) {
            temp = temp.tong(soPhucs[i]);
        }
        temp.setPhanThuc(temp.getPhanThuc() / soPhucs.length);
        temp.setPhanAo(temp.getPhanAo() / soPhucs.length);
        System.out.println("Trung binh = " + temp.toString());

        // Max Modulus
        double max = -1;
        int index = -1;
        for (int i = 0; i < soPhucs.length; i++) {
            double modulus = soPhucs[i].modulus();
            if (max < modulus) {
                max = modulus;
                index = i;
            }
        }
        System.out.println("So co modulus lon nhat la "+ soPhucs[index].toString()+ " = " + max);

        // So thoa man khong co phan ao
        int dem = 0;
        for(SoPhuc sp: soPhucs){
            if(sp.getPhanAo() == 0.0f)
                dem++;
        }
        System.out.println("So cac so thoa man = "+ dem);
    }
}
