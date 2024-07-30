package strate;

public class teste {

	public static void main(String[] args) {
		comportamento def = new comportamentoDefensivo();
		comportamento norm = new comportamentoNormal();
		comportamento agress = new comportamentoAgressivo();
		
		robo ro = new robo();
		
		ro.setStrategy(norm);
		ro.mover();
		ro.mover();
		ro.mover();
		ro.setStrategy(agress);
		ro.mover();
		ro.mover();
		ro.setStrategy(def);
		ro.mover();

	}

}
