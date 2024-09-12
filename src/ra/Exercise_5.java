package ra;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào bán kính hình tròn: ");
        float r=sc.nextFloat();
        final float pi=3.14f;
        float chuVi=2*pi*r;
        float dienTich=pi*r*r;
        System.out.println("chuVi: "+chuVi);
        System.out.println("Dien tich: "+dienTich);
    }
}
