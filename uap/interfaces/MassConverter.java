package uap.interfaces;

// Membuat interface MassConverter untuk mengkonversi massa
// dari gram ke kilogram
public interface MassConverter {
    // Konstanta untuk denominator konversi
    // dari gram ke kilogram
    public final int DENOMINATOR = 1000;

    // Metode untuk mengkonversi massa dari gram ke kilogram agar setiap kelas
    // yang mengimplementasikan interface ini harus ovverride method ini
    public double gramToKilogram();
}
