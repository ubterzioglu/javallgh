package javapolymorphism;

// Üst sınıf
class Arac {
    void hareketEt() {
        System.out.println("Araç hareket ediyor...");
    }
}

// Alt sınıflar
class Bisiklet extends Arac {
    @Override
    void hareketEt() {
        System.out.println("Bisiklet pedalla ilerliyor...");
    }
}

class Otobus extends Arac {
    @Override
    void hareketEt() {
        System.out.println("Otobüs yolcularla ilerliyor...");
    }
}

public class JavaPolymorphismSample {
    public static void main(String[] args) {
        Arac a1 = new Bisiklet();
        Arac a2 = new Otobus();

        a1.hareketEt(); // Bisiklet pedalla ilerliyor...
        a2.hareketEt(); // Otobüs yolcularla ilerliyor...
    }
}
