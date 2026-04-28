import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Telecommande{
    private ArrayList<Appareil> listeAppareil;

    public Telecommande(){
        this.listeAppareil = new ArrayList<>();

    }
    public void ajouterLampe(Lampe l) {
        if(l != null) this.listeAppareil.add(l);
    }

    public void activerLampe(int i) {
        this.listeAppareil.get(i).allumer();
    }

    public void desactiverLampe(int i) {
        this.listeAppareil.get(i).eteindre();
    }

    public void activerTout() {
        for (Appareil appareil : (this.listeAppareil)){
            appareil.allumer();
        }
    }

    public void augmenterSon(int i){
        this.listeAppareil.get(i).allumer();
    }

    public void desactiverHifi(int i){
        this.listeAppareil.get(i).eteindre();
    }

    public String toString() {
        String res = "Télécommande : \nLes lampes :\n";

        for (int i = 0; i < this.listeAppareil.size(); i++) {
            Lampe l = (Lampe) listeAppareil.get(i);
            if(l.isAllume()) {
                res = res + i + " : " + l.getLampe() + "allumé \n";
            }else{
                res = res + i + " : " + l.getLampe() + "éteinte \n";
            }
        }
        res += "Les Chaines Hifis : \n";
        for (int i = 0; i < this.listeAppareil.size(); i++) {
            Hifi h = (Hifi) listeAppareil.get(i);
            h.toString();
        }   
        return res;
    }

    public ArrayList<Appareil> getListeAppareil() {
        return listeAppareil;
    }
}