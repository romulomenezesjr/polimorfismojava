package aulapolimorfismo3;
public class Peixe extends Animal implements AnimalAquatico{
	
    public Peixe(double x, double y){
        super(x,y,"imagens\\peixe.png");
    }
    @Override
    public void nadar(){
   		this.x += 3;
    }
}