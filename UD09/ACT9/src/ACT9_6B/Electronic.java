package ACT9_6B;
/**
 *
 * @author srhig
 */
abstract class Electronic extends Producte{
    private int midaPantalla, ram, hdd;
    private String processador;
    public Electronic(String nom, double preu, double consumEnergetic, int gatantiaMesos, int midaPantalla, int ram, int hdd, String processador) {
        super(nom, preu, consumEnergetic, gatantiaMesos);
        this.midaPantalla = midaPantalla;
        this.ram = ram;
        this.hdd = hdd;
        this.processador = processador;
    }
    abstract double calculaDescompte();
    public int getMidaPantalla(){
        return midaPantalla;
    }
    @Override
    public String toString(){
        return super.toString() + ", la pantalla té una mida de: " + this.midaPantalla + ", té una memoria RAM de: " +
               this.ram + "\n, una disc dur de " + this.hdd + "GB i un processador " + this.processador; 
    }
    /*@Override
    public boolean equals(Object o){
        Electronic electronic = (Electronic) o;
        return (super.equals(electronic)) && (this.processador.equals(electronic.processador));
    }*/
}