import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notu: ");
        mat = input.nextInt();
        System.out.print("Fizik Notu: ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notu: ");
        turkce = input.nextInt();
        System.out.print("Kimya Notu: ");
        kimya = input.nextInt();
        System.out.print("Müzik Notu: ");
        muzik = input.nextInt();
        double average = (mat + fizik + turkce + kimya + muzik) /5;
        if (average <= 55) {
            System.out.println("Sınıfta kaldınız...");
            System.out.println("Ortalama: " + average);
        }
        else {
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
            System.out.println("Ortalama: " + average);
        }
    }
}