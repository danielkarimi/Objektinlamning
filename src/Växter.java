public abstract class Växter implements VäxterInterFace{

    

    private double längd;
    private String name;
    String typVäxt;
    String typFöda;

    //Skapar en konstruktor

    public Växter (double längd, String name) {
        this.längd = längd;
        this.name = name;

        

    }

        public double getLängd(){
        return längd;
        }
        public String getName(){
        return name;
     }
}
