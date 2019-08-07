package aulapolimorfismo2;
public class Peixe extends Animal{
    public Peixe(double x, double y){
        super(x,y,"imagens\\peixe.png");
    }
    @Override
    public void mover(AmbienteEnum ambiente){
    	if (ambiente == AmbienteEnum.AQUATICO)
    		this.x += 3;
    	else if (ambiente == AmbienteEnum.TERRESTRE)
    		this.x += 0;
    	else 
    		this.x += 0;
    }
}