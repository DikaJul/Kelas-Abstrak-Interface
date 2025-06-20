public class Tabung extends Bentuk {
    double jari2, tinggi;

    public Tabung(double jari2, double tinggi) {
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }
    @Override
    public double luas() {
        return 2 * Math.PI * jari2 * (jari2 + tinggi);
    }
}