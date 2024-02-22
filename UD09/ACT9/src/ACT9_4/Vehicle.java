package ACT9_4;
/**
 *
 * @author srhig
 */
public abstract class Vehicle {
    private String marca, model;
    private double preu;
    public Vehicle(String marca, String model, double preu){ //Constructor completo
        setMarca(marca);
        setModel(model);
        setPreu(preu);
    }
    abstract double calculaImpost();
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPreu() {
        return preu;
    }
    public void setPreu(double preu) {
        this.preu = preu;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " amb marca i model: " + getMarca() + " " + getModel() + ", amb preu: " + getPreu();
    }
}