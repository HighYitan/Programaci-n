package ACT9_5A;
/**
 *
 * @author srhig
 */
public class Tarjeta {
    private String codiTarjeta;
    protected double comisUs;
    private double importMaximCaixer, importMaximCompra;
    public Tarjeta(String codiTarjeta, double comisUs, double importMaximCaixer, double importMaximCompra) {
        this.codiTarjeta = codiTarjeta;
        this.comisUs = comisUs;
        this.importMaximCaixer = importMaximCaixer;
        this.importMaximCompra = importMaximCompra;
    }
}