public class Television {
    private int son = 0;

    /**
     * permet d'allumer ou d'augmenter le son de la chaine
     */
    public void allumer() {
        this.son += 10;
        // son maximum
        if (this.son > 100)
            this.son = 100;
    }

    /**
     * permet d'eteindre la chaine (son mis a 0)
     */
    public void eteindre() {
        this.son = 0;

    }

    /**
     * retourne le descriptif de la lampe sous la forme nom + "On"/"Off"
     */
    public String toString() {
        String r = "";
        if (this.son > 0) {
            r = "On";
        } else {
            r = "Off";
        }
        return ("Télévision : " + r);
    }
}
