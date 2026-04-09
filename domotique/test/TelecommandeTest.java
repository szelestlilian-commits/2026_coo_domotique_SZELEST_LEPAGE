import org.junit.jupiter.api.Test;

import java.awt.font.LayoutPath;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TelecommandeTest {

    @Test
    /**
     *ajout d'une lampe à une télecommande vide.
     */
    public void testAjoutLampeVide(){
        Lampe l = new Lampe("lampe");
        Telecommande t = new Telecommande();

        t.ajouterLampe(l);

        assertEquals(1, t.getListeLampe().size());
    }

    @Test
    /**
     * ajout d'une lampe a une télecommande qui possède déjà une lampe
     */
    public void testAjoutLampeUnElem(){
        Lampe l1 = new Lampe("lampe");
        ArrayList<Lampe> liste = new ArrayList<>();
        liste.add(l1);
        Telecommande t = new Telecommande(liste);

        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l2);

        assertEquals(2, t.getListeLampe().size());
    }

    @Test
    /**
     * active une lampe existante en position 0
     */
    public void testActiveLampe0(){
        Lampe l1 = new Lampe("lampe");
        ArrayList<Lampe> liste = new ArrayList<>();
        liste.add(l1);
        Telecommande t = new Telecommande(liste);

        t.activerLampe(0);

        assertEquals(true, l1.isAllume());
    }

    @Test
    /**
     * active une lampe existante en position 1
     */
    public void testActiveLampe1(){
        Lampe l1 = new Lampe("lampe");
        ArrayList<Lampe> liste = new ArrayList<>();
        liste.add(l1);
        Telecommande t = new Telecommande(liste);

        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l2);

        t.activerLampe(1);

        assertEquals(true, l2.isAllume());
    }

    @Test
    /**
     * active une lampe inexistante
     */
    public void testActiveLampeInexistante(){
        Lampe l1 = new Lampe("lampe");
        ArrayList<Lampe> liste = new ArrayList<>();
        liste.add(l1);
        Telecommande t = new Telecommande(liste);

        try{
            t.activerLampe(3);
        } catch(IndexOutOfBoundsException e){

        }
    }
}
