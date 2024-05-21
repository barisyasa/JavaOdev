package org.example.Personel;

public class PersonelTest {
    public static void main(String[] args) {

        Personel personel1 = new Personel();
        Personel personel2 = new Personel();

        personel1.ad="Barış";
        personel1.soyad="Yasa";
        personel1.yas="29";
        personel1.tckno="123456789";

        personel2.ad="Zafer";
        personel2.soyad="Yasa";
        personel2.yas="65";
        personel2.tckno="987654321";

        personel1.Listele();
        personel2.Listele();



    }
}
