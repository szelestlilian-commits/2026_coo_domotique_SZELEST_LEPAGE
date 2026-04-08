import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> listeLampe;

    public Telecommande(Lampe[] liste) {
        for (int i = 0; i < liste.length; i++) {
            this.listeLampe.add(liste[i]);
        }
    }

    public void ajouterLampe(Lampe l) {
        throw new Error("code non ecrit");
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
}