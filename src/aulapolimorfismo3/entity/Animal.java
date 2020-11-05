package aulapolimorfismo3.entity;

import java.io.File;

public abstract class Animal{

    protected double x;
    protected double y;
	protected String imagem;

    public Animal(double x, double y, String imagem){
        this.x = x;
        this.y = y;
        this.imagem = imagem;
    }

    public double getX(){
        return this.x;
    }

	public double getY() {
		return this.y;
	}

	public File getImagem() {
		return new File(this.imagem);
	}
    
}