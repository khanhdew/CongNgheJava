package Tuan5.exceptions;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Bai1 {
    private Random random;
    private int[] arr;

    public Bai1() {
        random = new Random();
        int n = random.nextInt(0, 100);
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(0, 12);
        }
        try {
            input();
        } catch (InvalidNumberException e) {
            System.out.println("Ban da nhap sai gia tri n");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ban da truy cap phan tu ngoai mang");
        }
    }

    public void input() throws InvalidNumberException, ArrayIndexOutOfBoundsException {
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                n = scanner.nextInt();
            } catch (InputMismatchException e) {
                throw new InvalidNumberException("Ban da nhap sai gia tri n");
            }
            if (n < 0 || n >= arr.length)
                throw new ArrayIndexOutOfBoundsException("Ban da truy cap phan tu ngoai mang");
            else {
                System.out.println("Phan tu thu " + n + " co gia tri = " + arr[n]);
            }
        }
    }

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
