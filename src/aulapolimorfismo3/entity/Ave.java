package aulapolimorfismo3.entity;
public class Ave extends Animal implements AnimalVoador{
    public Ave(double x, double y){
        super(x,y,"imagens\\ave.png");
    }
    
    @Override
    public void voar() {
    	this.x += 3;
    }
}