package uap.interfaces;

// Membuat interface MassCalcuable untuk menghitung massa untuk objek yang memiliki massa
public interface MassCalcuable {
    // Konstanta untuk massa jenis dan ketebalan
    public final int DENSITY = 8;
    public final double THICKNESS = 0.5;

    // Metode untuk menghitung massa objek agar setiap kelas yang
    // mengimplementasikan
    // interface ini harus mengimplementasikannya
    public double getMass();
}
