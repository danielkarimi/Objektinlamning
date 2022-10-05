import javax.swing.*;
import java.util.ArrayList;
public class MainVäxt {

    public static void main (String[] args) {
        

        Växter palm = new Palm (5, "Laura");
        Växter palm2 = new Palm(1,"Putte");
        Växter kaktus = new Kaktus(0.2,"Igge");
        Växter köttätande = new KöttätandeVäxter(0.7,"Meatloaf");

        ArrayList<Växter>myVäxter=new ArrayList<>();
        myVäxter.add(palm);
        myVäxter.add(palm2);
        myVäxter.add(kaktus);
        myVäxter.add(köttätande);
        String meddelande = "Välj vilken växt du vill mata av dessa "+myVäxter.size()+"\n";
        for (int i=0; i<myVäxter.size(); i++){
            meddelande +=(i+1)+"."+myVäxter.get(i).getName()+"\n";
        }
        int svar=Integer.parseInt(JOptionPane.showInputDialog(meddelande))-1;
        JOptionPane.showMessageDialog(null,myVäxter.get(svar).antalFöda());
    }

}
