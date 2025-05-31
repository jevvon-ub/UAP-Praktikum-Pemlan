import java.util.Scanner;

import uap.models.Sphere;
import uap.models.Torus;

// Membuat kelas KalkulatorPabrik yang berfungsi sebagai
// kalkulator untuk menghitung volume, luas permukaan, massa, 
// biaya pengiriman donat dengan lubang dan tanpa lubang
public class KalkulatorPabrik {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("JEVON MOZART CHRISTIAN BANO");
        System.out.println("245150700111020");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");

        System.out.print("Isikan Radius\t: ");
        // Membaca input radius mayor dari pengguna
        double majorRadiusTorus = scanner.nextDouble();
        System.out.print("Isikan radius\t: ");
        // Membaca input radius minor dari pengguna
        double minorRadiusTorus = scanner.nextDouble();
        System.out.println("=============================================");

        // Membuat objek Torus dengan radius mayor dan minor yang telah diinput
        Torus torus = new Torus(majorRadiusTorus, minorRadiusTorus);
        // Memanggil metode printInfo pada objek Torus untuk menampilkan informasi
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius\t: ");
        // Membaca input radius dari pengguna untuk Sphere
        double radiusSphere = scanner.nextDouble();
        System.out.println("=============================================");

        // Membuat objek Sphere dengan radius yang telah diinput
        Sphere sphere = new Sphere(radiusSphere);
        // Memanggil metode printInfo pada objek Sphere untuk menampilkan informasi
        sphere.printInfo();
        System.out.println("=============================================");
    }
}
