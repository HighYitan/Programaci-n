package ACT9_6B;
/**
 *
 * @author srhig
 */
abstract class Electrodomestic extends Producte{
    private char classeEnergetica;
    public Electrodomestic(String nom, double preu, double consumEnergetic, int garantiaMesos, char classeEnergetica) {
        super(nom, preu, consumEnergetic, garantiaMesos);
        this.classeEnergetica = classeEnergetica;
    }
    final double calculaSuplement(){
        /*switch(classeEnergetica){
            case 'A':
                return super.getPreu() * 0.05;
            case 'B':
                return super.getPreu() * 0.10;
            case 'C':
                return super.getPreu() * 0.15;
        }*/
        /*if(classeEnergetica == 'A'){
            return super.getPreu() * 0.05;
        }
        else if(classeEnergetica == 'B'){
            return super.getPreu() * 0.10;
        }
        else{
            return super.getPreu() * 0.15;
        }*/
        return ((this.classeEnergetica == 'A') ? super.getPreu() * 0.05 :
                    (this.classeEnergetica == 'B') ? super.getPreu() * 0.10 : super.getPreu() * 0.15);
    }
    @Override
    public String toString(){
        return super.toString() + ", té una classeEnergetica: " + this.classeEnergetica; 
    }
    /*@Override
    public boolean equals(Object o){
        Electrodomestic electrodomestic = (Electrodomestic) o;
        return (super.equals(electrodomestic)) && (this.classeEnergetica.equals(electrodomestic.classeEnergetica));
    }*/
}