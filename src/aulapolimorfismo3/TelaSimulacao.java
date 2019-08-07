package aulapolimorfismo3;
import java.awt.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
public class TelaSimulacao extends Canvas {
	
	private Animal[] animais;

	public TelaSimulacao(Animal[] animais) {
		this.animais = animais;
	}

	public void inicializar() {
		JFrame frame = new JFrame();
		frame.setSize(800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.setVisible(true);
		
	}

	public void paint(Graphics g) {
		Graphics2D g2;
		g2 = (Graphics2D) g;
		
		Image img = null;
		for (Animal animal : animais){
			g2.drawString(	animal.getClass().getSimpleName(), 
							(int)animal.getX()*10, 
							(int)animal.getY()*10+50);
			try {
				img = ImageIO.read(animal.getImagem());
			} catch (IOException e) {
				e.printStackTrace();
			}
			g2.drawImage(img, (int) animal.getX()*10, (int) animal.getY()*10, this);
//			
		}
	}
}