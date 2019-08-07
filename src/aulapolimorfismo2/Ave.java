package aulapolimorfismo2;
public class Ave extends Animal{
    public Ave(double x, double y){
        super(x,y,"imagens\\ave.png");
    }
    @Override
    public void mover(AmbienteEnum ambiente){
    	if (ambiente == AmbienteEnum.AQUATICO)
    		this.x += 0;
    	else if (ambiente == AmbienteEnum.TERRESTRE)
    		this.x += 1.5;
    	else 
    		this.x += 3;
    }
}