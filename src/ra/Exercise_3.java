package ra;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều dài 1 cạnh hình vuông");
        float a = sc.nextFloat();
        float chuViHinhVuong = a*4;
        float dienTichHinhVuong = a*a;
        System.out.println("Chu vi hình vuông là: " + chuViHinhVuong);
        System.out.println("Diện tích hình vuông là: " + dienTichHinhVuong);
    }
}
