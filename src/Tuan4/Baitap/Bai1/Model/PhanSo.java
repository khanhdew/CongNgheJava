package Tuan4.Baitap.Bai1.Model;

public class PhanSo {
    private int t;
    private int m;

    public PhanSo() {
        this.t = 0;
        this.m = 1;
    }

    public PhanSo(int t, int m) {
        this.t = t;
        this.m = m;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "P = " + t + "/" + m;
    }

    public double tong(PhanSo ps2) {
        return (double) this.t / this.m + (double) ps2.getT() / ps2.getM();
    }

    public double hieu(PhanSo ps2) {
        return (double) this.t / this.m - (double) ps2.getT() / ps2.getM();
    }

    public double tich(PhanSo ps2) {
        return (double) this.t / this.m * ps2.getT() / ps2.getM();
    }

    public double thuong(PhanSo ps2) {
        return (double) this.t * ps2.getM() / this.m * ps2.getT();
    }

    private int gcd() {
        int i;
        if (t < m)
            i = t;
        else
            i = m;

        for (i = i; i > 1; i--) {

            if (t % i == 0 && m % i == 0)
                return i;
        }

        return 1;
    }

    public void rutGon() {
        int uocChung = gcd();
        this.t = t / uocChung;
        this.m = m / uocChung;
    }
}
