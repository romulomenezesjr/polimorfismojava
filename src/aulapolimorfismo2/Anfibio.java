package aulapolimorfismo2;
public class Anfibio extends Animal{
    public Anfibio(double x, double y){
        super(x,y,"imagens\\sapo.png");
    }
    @Override
    public void mover(AmbienteEnum ambiente){
    	if (ambiente == AmbienteEnum.AQUATICO)
    		this.x += 0.5;
    	else if (ambiente == AmbienteEnum.TERRESTRE)
    		this.x += 1.5;
    	else 
    		this.x += 0;
    }
}