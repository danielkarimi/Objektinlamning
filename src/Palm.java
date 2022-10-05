public class Palm extends Växter{
    final double föda = 0.5;
    public Palm (double längd, String name) {
        super (längd, name);
        typVäxt = "palm";
        typFöda = "kranvatten";
    }

    public String antalFöda() {
        return "Denna palm " + this.getName() + " behöver " +
                (this.getLängd() * föda) + " liter " + typFöda + " per dag";
    }
}