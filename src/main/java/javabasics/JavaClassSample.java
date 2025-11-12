class Matematik {
    // Static method
    static int topla(int a, int b) {
        return a + b;
    }

    // Instance method
    int carp(int a, int b) {
        return a * b;
    }
}

// Sınıf adını Main yerine Demo yaptık
public class JavaClassSample {
    public static void main(String[] args) {
        // Static method çağrısı (new yok)
        int toplam = Matematik.topla(3, 5);
        System.out.println("Toplam: " + toplam);

        // Instance method çağrısı (new gerekli)
        Matematik m = new Matematik();
        int carpim = m.carp(3, 5);
        System.out.println("Çarpım: " + carpim);
    }
}