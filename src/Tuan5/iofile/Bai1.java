package Tuan5.iofile;


import java.io.File;
import java.io.FileNotFoundException;

public class Bai1 {
    public Bai1() {
        String str = "/home/khanhdz/IdeaProjects/CongNgheJava/src/Tuan5/iofile/example.txt";
        try {
            readFileProperties(str);
            changeFileProperties(str);
            readFileProperties(str);
        } catch (FileNotFoundException e) {
            System.out.println("Khong co file");
        }

    }

    public void readFileProperties(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        System.out.println("File co the doc: " + file.canRead());
        System.out.println("File co the ghi: " + file.canWrite());
        System.out.println("File co kich thuoc: " + file.getTotalSpace());
        System.out.println("File co duong dan: " + file.getPath());
        System.out.println("File co ten: " + file.getName());
    }

    public void changeFileProperties(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        file.setReadable(true);
        file.setWritable(false);
    }

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
    }
}
