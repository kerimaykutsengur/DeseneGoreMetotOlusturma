import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    static void recursiveDesign(int editedNumber, int initialNumber, boolean isNegative) {
        if (isNegative == false) {

            editedNumber = editedNumber - 5;
            System.out.print(editedNumber + " ");
            if (editedNumber <= 0) {
                isNegative = true;
            }
            recursiveDesign(editedNumber, initialNumber, isNegative);
        } else if (isNegative == true) {
            if (editedNumber != initialNumber) {

                editedNumber = editedNumber + 5;
                System.out.print(editedNumber + " ");
                recursiveDesign(editedNumber, initialNumber, isNegative);
            }



        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz :");
        int n = input.nextInt();
        System.out.print("Girdiğiniz sayı: " + n + " ");
        recursiveDesign(n , n, false);
        System.out.println("Tesekkurler.");

    }
}
