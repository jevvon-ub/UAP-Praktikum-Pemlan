package uap.interfaces;

// Membuat interface ShippingCostCalculator untuk menghitung biaya pengiriman
// dengan harga per kilogram
public interface ShippingCostCalculator {
    // Konstanta untuk harga per kilogram
    public final int PRICE_PER_KG = 2000;

    // Metode untuk menghitung biaya pengiriman agar setiap kelas yang
    // mengimplementasikan interface ini harus override method ini
    public double calculateCost();
}
