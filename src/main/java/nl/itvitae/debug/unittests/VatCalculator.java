package nl.itvitae.debug.unittests;

public class VatCalculator {

    public int excludingVat(int price) {
        return price - price * 21 / 100;
    }
}
