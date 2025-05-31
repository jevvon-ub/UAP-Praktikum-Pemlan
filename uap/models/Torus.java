package uap.models;

import java.text.NumberFormat;
import java.util.Locale;

import uap.bases.Shape;
import uap.interfaces.*;

// Membuat kelas Torus yang merupakan turunan dari Shape
// dan mengimplementasikan interface ThreeDimensional, PiRequired,
// MassCalcuable, MassConverter, dan ShippingCostCalculator
public class Torus extends Shape
        implements ThreeDimensional, PiRequired, MassCalcuable, MassConverter, ShippingCostCalculator {
    // Radius mayor dan minor dari Torus yang bertipe double bersifat private
    private double majorRadius;
    private double minorRadius;

    // Constructor tanpa parameter
    public Torus() {
    }

    // Constructor dengan parameter majorRadius dan minorRadius untuk
    // menginisialisasi
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    // Method getVolume untuk menghitung volume Torus sesuai rumus dengan override
    // dari interface ThreeDimensional
    public double getVolume() {
        return (2 * majorRadius * Math.pow(minorRadius, 2)) * Math.pow(PI, 2);
    }

    @Override
    // Method getSurfaceArea untuk menghitung luas permukaan Torus sesuai rumus
    // dengan override dari interface ThreeDimensional
    public double getSurfaceArea() {
        return (4 * majorRadius * minorRadius) * Math.pow(PI, 2);
    }

    @Override
    // Method getMass untuk menghitung massa Torus sesuai rumus dengan override dari
    // interface MassCalcuable dan menggunakan konstanta
    // DENSITY dan THICKNESS
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    // Method gramToKilogram untuk mengkonversi massa dari gram ke kilogram
    // dengan override dari interface MassConverter dan menggunakan konstanta
    // DENOMINATOR
    public double gramToKilogram() {
        return Math.ceil(getMass() / DENOMINATOR);
    }

    @Override
    // Method calculateCost untuk menghitung biaya pengiriman Torus
    // sesuai rumus dengan override dari interface ShippingCostCalculator
    // menggunakan konstanta PRICE_PER_KG
    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }

    @Override
    // Method printInfo untuk mencetak informasi Torus
    public void printInfo() {
        // Mencetak informasi Torus
        System.out.println("Volume\t\t: " + getVolume());
        System.out.println("Luas Permukaan\t: " + getSurfaceArea());
        System.out.println("Massa\t\t: " + getMass());
        System.out.println("Massa dalam kg\t: " + gramToKilogram());

        // Format biaya kirim dalam format mata uang Rupiah
        Locale locale = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(locale);

        // Mencetak biaya pengiriman dengan format mata uang Rupiah
        System.out.println("Biaya kirim\t: " + formatRupiah.format(calculateCost()));
    }
}
