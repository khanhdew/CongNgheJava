package Tuan5.iofile;

import java.io.File;

public class Bai2 {
    private int count= 0;
    public Bai2(){
        String str = "//home//khanhdz//Downloads//Java Programming - VN - NTPhuc//";
        startScanning(str);
        System.out.println("Ban co "+count+ " virus");
    }

    public void startScanning(String dir){
        File f = new File(dir);
        System.out.println(f.getAbsolutePath());
        if(!f.isDirectory()){
            if(f.getName().endsWith(".png"))
                count++;
        }
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for(File file:files){
                startScanning(file.getPath());
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Bai2 bai2 = new Bai2();
    }
}
