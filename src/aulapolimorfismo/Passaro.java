package aulapolimorfismo;
public class Passaro extends Animal{

    public Passaro(double x, double y){
        super(x,y,"imagens\\passaro.png");
    }

    @Override
    public void mover(){
        this.x += 3;
    }

}