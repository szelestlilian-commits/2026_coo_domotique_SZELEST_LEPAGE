import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TelecommandeTest {

    @Test
    /**
     *ajout d'une lampe à une télecommande vide.
     */
    public void testAjoutLampeVide() {
        Lampe l = new Lampe("lampe");
        Telecommande t = new Telecommande();

        t.ajouterAppareil(l);

        assertEquals(1, t.getListeAppareil().size());
    }

    @Test
    /**
     * ajout d'une lampe a une télecommande qui possède déjà une lampe
     */
    public void testAjoutLampeUnElem() {
        Lampe l1 = new Lampe("lampe");
        ;
        Lampe l2 = new Lampe("lampe2");

        Telecommande t = new Telecommande();

        t.ajouterAppareil(l1);
        t.ajouterAppareil(l2);

        assertEquals(2, t.getListeAppareil().size());
    }

    @Test
    /**
     * active une lampe existante en position 0
     */
    public void testActiveLampe0() {
        Lampe l1 = new Lampe("lampe");

        Telecommande t = new Telecommande();

        t.ajouterAppareil(l1);

        t.activerAppareil(0);

        assertEquals(true, l1.isAllume());
    }

    @Test
    /**
     * active une lampe existante en position 1
     */
    public void testActiveLampe1() {
        Lampe l1 = new Lampe("lampe");
        Lampe l2 = new Lampe("lampe2");

        Telecommande t = new Telecommande();

        t.ajouterAppareil(l1);
        t.ajouterAppareil(l2);
        t.activerAppareil(1);

        assertEquals(true, l2.isAllume());
    }

    @Test
    /**
     * active une lampe inexistante
     */
    public void testActiveLampeInexistante() {
        Lampe l1 = new Lampe("lampe");
        ArrayList<Lampe> liste = new ArrayList<>();
        liste.add(l1);
        Telecommande t = new Telecommande();
        t.ajouterAppareil(l1);

        try {
            t.activerAppareil(3);
        } catch (IndexOutOfBoundsException e) {

        }
    }

    @Test
    /**
     * active une cheminee
     */
    public void testAllumerCheminee() {
        Cheminee c = new Cheminee();
        Adaptateur ad = new Adaptateur(c);

        Telecommande t = new Telecommande();
        t.ajouterAppareil(ad);

        t.activerAppareil(0);

        assertEquals(10, ad.getLumiere());
    }
}
