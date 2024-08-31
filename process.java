package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static string.baitaptrentruong.deleteOddNumbers;
import static string.baitaptrentruong.findMax2;
import static string.baitaptrentruong.importData;
import static string.baitaptrentruong.printData;

public class process {

    public static void runMenu() {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();

        while (true) {

            System.out.println("==== CHUONG TRINH QUAN LY MANG ====");
            System.out.println("1. Nhap du lieu cho mang");
            System.out.println("2. Xuat du lieu cua mang");
            System.out.println("3. Tim phan tu lon thu 2");
            System.out.println("4. Xoa cac so le");
            System.out.println("5. Thoat");
            System.out.print("Chon mot lua chon : ");

            int choice = keyboard.nextInt();

            if (choice == 5) {
                System.out.println("Thoat chuong trinh.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("So phan tu la: ");
                    int n = keyboard.nextInt();
                    importData(number);
                    System.out.println("Du lieu da duoc nhap.");
                    break;
                case 2:
                    printData(number);
                    break;
                case 3:
                    if (number.size() < 2) {
                        System.out.println("Mang phai co it nhat 2 phan tu.");
                    } else {
                        System.out.println("Phan tu lon thu 2 cua mang la: " + findMax2(number));
                    }
                    break;
                case 4:
                    System.out.print("Mang sau khi xoa cac so le: ");
                    deleteOddNumbers(number);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        runMenu();
    }
}
