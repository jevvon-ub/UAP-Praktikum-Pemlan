package uap.interfaces;

// Membuat interface threeDimensional untuk objek tiga dimensi
// yang memiliki luas permukaan dan volume
public interface ThreeDimensional {
    // Metode untuk mendapatkan luas permukaan objek agar setiap kelas
    // yang mengimplementasikan interface ini harus mengoverride method ini
    // sesuai dengan perhitungan luas permukaan objek tersebut
    double getSurfaceArea();

    // Metode untuk mendapatkan volume objek agar setiap kelas
    // yang mengimplementasikan interface ini harus mengoverride method ini
    // sesuai dengan perhitungan volume objek tersebut
    double getVolume();
}
