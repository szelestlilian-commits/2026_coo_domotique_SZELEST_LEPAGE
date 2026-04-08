import java.util.*;

public class Telecommande {

    private List<Lampe> lampes;

    public Telecommande() {
        lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe l) {
        lampes.add(l);
    }

    public void activerLampe(int i) {
        if (i < 0 || i >= lampes.size()) {
            throw new IndexOutOfBoundsException();
        }
        lampes.get(i).allumer();
    }

    public void desactiverLampe(int i) {
        if (i < 0 || i >= lampes.size()) {
            throw new IndexOutOfBoundsException();
        }
        lampes.get(i).eteindre();
    }

    public void activerTout() {
        for (Lampe l : lampes) {
            l.allumer();
        }
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < lampes.size(); i++) {
            res += i + " : " + lampes.get(i) + "\n";
        }
        return res;
    }
}
