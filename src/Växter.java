public abstract class Växter implements VäxterInterFace{

    //Här ger jag ut variablar som är nödvändiga för inläsning av växt

    private double längd;
    private String name;
    String typVäxt;
    String typFöda;

    //Skapar en konstruktor

    public Växter (double längd, String name) {
        this.längd = längd;
        this.name = name;

        // Sedan använder jag getters för att kunna kalla på de olika variablarna

    }

        public double getLängd(){
        return längd;
        }
        public String getName(){
        return name;
     }
}