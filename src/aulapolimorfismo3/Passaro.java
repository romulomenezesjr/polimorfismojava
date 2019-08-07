package aulapolimorfismo3;
public class Passaro extends Animal implements AnimalVoador{
    public Passaro(double x, double y){
        super(x,y,"imagens\\passaro.png");
    }
    
    @Override
    public void voar() {
    	this.x += 3;
    }
}