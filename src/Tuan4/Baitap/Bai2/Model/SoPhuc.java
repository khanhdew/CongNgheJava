package Tuan4.Baitap.Bai2.Model;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    @Override
    public String toString() {
        return "SoPhuc{" +
                "phanThuc = " + phanThuc +
                ", phanAo = " + phanAo +"i"+
                '}';
    }

    public SoPhuc tong(SoPhuc sp2){
        return new SoPhuc(this.phanThuc + sp2.phanThuc, this.phanAo + sp2.phanAo);
    }

    public double modulus() {
        return Math.sqrt(Math.pow(phanThuc, 2) + Math.pow(phanAo, 2));
    }



}
