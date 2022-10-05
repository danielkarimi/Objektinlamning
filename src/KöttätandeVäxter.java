public class KöttätandeVäxter extends Växter{

    double tillSkott = 0.2;
    double basNivå = 0.1;

    public KöttätandeVäxter (double längd, String name){
        super (längd, name);
        typVäxt = "Köttätandeväxter";
        typFöda = "Protein dryck";


    }

    public String antalFöda() {
        return "Denna köttätande växt" + typVäxt + " behöver " +
                (basNivå + (tillSkott * this.getLängd())) + " Liter " + typFöda + " per dag ";
    }
}




