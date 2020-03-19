import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in);

        System.out.print("Nhap vao so nam: ");
        int year = inputYear.nextInt();

//        if (year % 4 == 0) {
//            if (year % 100 != 0) {
//                System.out.println("Nam Nhuan");
//            } else {
//                if (year % 400 == 0) {
//                    System.out.println("Nam Nhuan");
//                } else {
//                    System.out.println("Khong phai Nam Nhuan");
//                }
//            }
//        } else {
//            System.out.println("Khong phai Nam Nhuan");
//        }

        //CleanCode

        boolean confirm = false;
        boolean yearDivideBy4 = year % 4 == 0;
        if (yearDivideBy4) {
            boolean yearDivideBy100 = year % 100 == 0;
            if (!yearDivideBy100){
                confirm = true;
            } else {
                boolean yearDivideBy400 = year % 400 == 0;
                if (yearDivideBy400){
                    confirm = true;
                }
            }
        }
        if(confirm){
            System.out.printf("%d la nam nhuan",year);
        }else {
            System.out.printf("%d khong phai la nam nhuan",year);
        }
    }
}