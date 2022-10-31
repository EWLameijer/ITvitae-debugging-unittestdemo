package nl.itvitae.debug.unittests;

public class Program {
    public static void main(String[] args) {
        var vatCalculator = new VatCalculator();
        var exclVat = vatCalculator.excludingVat(121);
        System.out.println(exclVat);
    }
}
