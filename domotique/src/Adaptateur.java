public class Adaptateur implements Appareil{
    Cheminee cheminee;

    public Adaptateur(Cheminee c){
        this.cheminee = c;
    }
    @Override
    public void allumer() {
        cheminee.changerIntensite(10);
    }

    @Override
    public void eteindre() {
        this.cheminee.changerIntensite(0);
    }

    public int getLumiere(){
        return this.cheminee.getLumiere();
    }
}
