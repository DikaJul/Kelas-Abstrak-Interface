public class BentukMain {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + (int) lingkaran.jari2);
        System.out.println("luas:" + lingkaran.luas());

        Tabung tabung = new Tabung(10, 5);
        System.out.println("== Tabung ==");
        System.out.println("jari2: " + (int) tabung.jari2 + ", Tinggi:" + (int) tabung.tinggi);
        System.out.println("luas:" + tabung.luas());
    }
}