package javainheritence;

class Hayvan {
    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    void miyavla() {
        System.out.println("Miyav!");
    }
}

public class JavaInheritenceSample {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.sesCikar(); // Üst sınıftan miras alınan metot
        kedi.miyavla();  // Alt sınıfa özgü metot
    }
}

