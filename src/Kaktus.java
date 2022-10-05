public class Kaktus extends Växter{

    public Kaktus (double längd, String name){
        super (längd,name);
        typVäxt= "Kaktus";
        typFöda= "Mineralvatten";
        }

        public String antalFöda () {
        return "Denna kaktus" + this.getName() + " behöver 0.2 liter" + typFöda + " per dag";
        }
}