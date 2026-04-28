public class Adaptateur implements Appareil{
    Cheminee cheminee = new Cheminee();

    @Override
    public void allumer() {
        this.cheminee.intensite += 10;
    }

    @Override
    public void eteindre() {
        this.cheminee.intensite = 0;
    }
}
