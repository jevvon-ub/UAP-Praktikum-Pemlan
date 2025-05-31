package uap.bases;

// Membuat kelas abstrak Shape untuk bluprint sebuah shape
public abstract class Shape {
    // Atribut untuk menyimpan nama shape
    private String name;

    // Konstruktor tanpa parameter
    // untuk inisialisasi objek Shape
    public Shape() {
    }

    // Konstruktor dengan parameter
    // untuk inisialisasi objek Shape dengan nama
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Metode untuk mendapatkan nama shape
    public String getName() {
        return name;
    }

    // Metode abstrak untuk menghitung luas shape agar setiap subclass harus
    // mengimplementasikannya
    public abstract void printInfo();
}
