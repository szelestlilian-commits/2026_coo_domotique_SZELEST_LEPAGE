import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Telecommande {
    private ArrayList<Lampe> listeLampe;

    public Telecommande(){
        this.listeLampe = new ArrayList<>();
    }

    public Telecommande(ArrayList<Lampe> liste) {
        if(liste != null) {
            this.listeLampe = liste;
        }
    }

    public void ajouterLampe(Lampe l) {
        if(l != null) this.listeLampe.add(l);
    }

    public void activerLampe(int i) {
        this.listeLampe.get(i).allumer();
    }

    public void desactiverLampe(int i) {
        this.listeLampe.get(i).eteindre();
    }

    public void activerTout() {
        for (Lampe lampe : this.listeLampe){
            lampe.allumer();
        }
    }

    public String toString() {
        String res = "Télécommande : \n";

        for (int i = 0; i < this.listeLampe.size(); i++) {
            Lampe l = listeLampe.get(i);
            if(l.isAllume()) {
                res = res + i + " : " + l.getLampe() + "allumé \n";
            }else{
                res = res + i + " : " + l.getLampe() + "éteinte \n";
            }
        }
        return res;
    }

    public ArrayList<Lampe> getListeLampe() {
        return listeLampe;
    }
}