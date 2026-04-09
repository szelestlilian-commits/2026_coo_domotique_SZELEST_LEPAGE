import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Telecommande {
    private ArrayList<Lampe> listeLampe;
    private ArrayList<Hifi> listeHifi;

    public Telecommande(){
        this.listeLampe = new ArrayList<>();
        this.listeHifi = new ArrayList<>();
    }

    public Telecommande(ArrayList<Lampe> liste, ArrayList<Hifi> listeChaineHifi) {
        if(liste != null) {
            this.listeLampe = liste;
        }
        if(liste != null) {
            this.listeHifi = listeChaineHifi;
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

    public void augmenterSon(int i){
        this.listeHifi.get(i).allumer();
    }

    public void desactiverHifi(int i){
        this.listeHifi.get(i).eteindre();
    }

    public String toString() {
        String res = "Télécommande : \nLes lampes :\n";

        for (int i = 0; i < this.listeLampe.size(); i++) {
            Lampe l = listeLampe.get(i);
            if(l.isAllume()) {
                res = res + i + " : " + l.getLampe() + "allumé \n";
            }else{
                res = res + i + " : " + l.getLampe() + "éteinte \n";
            }
        }
        res += "Les Chaines Hifis : \n";
        for (int i = 0; i < this.listeLampe.size(); i++) {
            Hifi h = listeHifi.get(i);
            h.toString();
        }   
        return res;
    }

    public ArrayList<Lampe> getListeLampe() {
        return listeLampe;
    }
}