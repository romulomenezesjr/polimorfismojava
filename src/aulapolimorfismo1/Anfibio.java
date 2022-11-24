package aulapolimorfismo1;

public class Anfibio extends Animal{

    public Anfibio(double x, double y){
        super(x,y,"imagens/sapo.png");
    }
    @Override
    public void mover(){
        this.x += 1.5;
    }

}