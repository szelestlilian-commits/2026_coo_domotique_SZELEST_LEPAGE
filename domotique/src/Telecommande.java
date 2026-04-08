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
            this.listeLampe.addAll(liste);
        }
    }

    public void ajouterLampe(Lampe l) {
        if(l != null) this.listeLampe.add(l);
    }

    public void activerLampe(int i) {
        throw new Error("code non ecrit");
    }

    public void desactiverLampe(int i) {
        throw new Error("code non ecrit");
    }

    public void activerTout() {
        throw new Error("code non ecrit");
    }

    public String toString() {
        throw new Error("code non ecrit");
    }

    public ArrayList<Lampe> getListeLampe() {
        return listeLampe;
    }
}