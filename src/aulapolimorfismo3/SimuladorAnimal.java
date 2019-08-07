package aulapolimorfismo3;

import aulapolimorfismo2.AmbienteEnum;

public class SimuladorAnimal {

    public void executarSimulacao(Animal[] animais, AmbienteEnum ambiente){
        for (Animal animal : animais){
        	if (ambiente == AmbienteEnum.AEREO && animal instanceof AnimalVoador) {
        		AnimalVoador v = (AnimalVoador) animal;
        		v.voar();
        	} else if (ambiente == AmbienteEnum.TERRESTRE && animal instanceof AnimalTerrestre) {
        		AnimalTerrestre v = (AnimalTerrestre) animal;
        		v.andar();
        	} else if (ambiente == AmbienteEnum.AQUATICO && animal instanceof AnimalAquatico){
        		AnimalAquatico v = (AnimalAquatico) animal;
    			v.nadar();
        	}
        }
    	
    }
    public static void main(String args[]){
    	
    	Animal animais[] = new Animal[3];
    	animais[0] = new Anfibio(0.,0.);
        animais[1] = new Passaro(0.,10.);
        animais[2] = new Peixe(0.,20.);
         
        SimuladorAnimal simulador = new SimuladorAnimal();
        for (int i=0;i<10;i++)
        	simulador.executarSimulacao(animais, AmbienteEnum.AQUATICO);
		
        TelaSimulacao tela = new TelaSimulacao(animais);
        tela.inicializar();
    }
}