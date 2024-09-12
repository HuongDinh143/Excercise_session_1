package ra;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tỷ giá:");
        float rate=sc.nextFloat();
        System.out.println("Tỷ giá:"+rate);
        System.out.println("Mời bạn nhập số tiền USD:");
        float USD=sc.nextFloat();
        double VND=USD*rate;
        System.out.println(USD+"$");
        System.out.println("Quy đổi VND: "+VND);
    }
}
