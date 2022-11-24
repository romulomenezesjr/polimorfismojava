package aulapolimorfismo1;
public class Peixe extends Animal{

    public Peixe(double x, double y){
        super(x,y,"imagens/peixe.png");
    }

    @Override
    public void mover(){
        this.x += 1;
    }

}