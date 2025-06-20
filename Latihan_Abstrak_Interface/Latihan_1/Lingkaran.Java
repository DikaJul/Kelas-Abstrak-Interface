 public class Lingkaran extends Bentuk {

    double jari2;
    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    @Override
    public double luas() {
        return Math.PI * jari2 * jari2;
    }
}