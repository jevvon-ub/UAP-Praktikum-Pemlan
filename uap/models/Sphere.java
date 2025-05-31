package uap.models;

import java.text.NumberFormat;
import java.util.Locale;

import uap.bases.Shape;
import uap.interfaces.*;

// Membuat kelas Sphere yang merupakan turunan dari Shape
// dan mengimplementasikan interface ThreeDimensional, PiRequired,
// MassCalcuable, MassConverter, dan ShippingCostCalculator
public class Sphere extends Shape
        implements ThreeDimensional, PiRequired, MassCalcuable, MassConverter, ShippingCostCalculator {
    // Radius dari Sphere yang bertipe double bersifat private
    private double radius;

    // Constructor tanpa parameter
    public Sphere() {
    }

    // Constructor dengan parameter radius untuk menginisialisasi radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    // Metohd getVolume untuk menghitung volume Sphere sesuai rumus dengan overide
    // dari interface ThreeDimensional
    public double getVolume() {
        return (4 * PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    // Method getSurfaceArea untuk menghitung luas permukaan Sphere sesuai rumus
    // dengan overide dari interface ThreeDimensional
    public double getSurfaceArea() {
        return 4 * PI * Math.pow(radius, 2);
    }

    @Override
    // Method getMass untuk menghitung massa Sphere sesuai rumus dengan overide dari
    // interface MassCalcuable dan menggunakan konstanta
    // DENSITY dan THICKNESS
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    // Method gramToKilogram untuk mengkonversi massa dari gram ke kilogram
    // dengan overide dari interface MassConverter dan menggunakan konstanta
    // DENOMINATOR
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    // Method calculateCost untuk menghitung biaya pengiriman Sphere
    // sesuai rumus dengan overide dari interface ShippingCostCalculator
    // menggunakan konstanta PRICE_PER_KG
    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }

    @Override
    // Method printInfo untuk mencetak informasi Sphere
    public void printInfo() {
        // Mencetak informasi Sphere
        System.out.println("Volume\t\t: " + getVolume());
        System.out.println("Luas Permukaan\t: " + getSurfaceArea());
        System.out.println("Massa\t\t: " + getMass());
        System.out.println("Massa dalam kg\t: " + gramToKilogram());

        // Menggunakan NumberFormat untuk format mata uang Rupiah
        Locale locale = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(locale);

        // Mencetak biaya pengiriman dengan format mata uang Rupiah
        System.out.println("Biaya kirim\t: " + formatRupiah.format(calculateCost()));
    }
}
