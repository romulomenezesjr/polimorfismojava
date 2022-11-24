package aulapolimorfismo;
public class Ave extends Animal{

    public Ave(double x, double y){
        super(x,y,"imagens/ave.png");
    }

    @Override
    public void mover(){
        this.x += 3;
    }

}