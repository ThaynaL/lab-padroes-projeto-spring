package one.digitalinnovation.gof;

public class SingletonLazyHolder {
	private static class instanceHoder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return instanceHoder.instancia;
	}

}
