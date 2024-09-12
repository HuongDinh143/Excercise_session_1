package ra;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm môn toán");
        float diemToan = sc.nextFloat();
        System.out.println("Mời bạn nhập điểm môn văn");
        float diemVan = sc.nextFloat();
        System.out.println("Mời bạn nhập điểm môn anh");
        float diemAnh = sc.nextFloat();
        float diemTB=(diemToan+diemVan+diemAnh)/3;
        System.out.println("Điểm trung bình 3 môn toán văn anh là:"+diemTB);
    }
}
