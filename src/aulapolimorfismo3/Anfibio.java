package aulapolimorfismo3;
public class Anfibio extends Animal implements AnimalAquatico, AnimalTerrestre{
    public Anfibio(double x, double y){
        super(x,y,"imagens\\sapo.png");
    }
    @Override
    public void andar(){
   		this.x += 1.5;
    }
    
    public void nadar() {
   		this.x += 0.5;
    }
}