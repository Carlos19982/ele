package electro;

public class Lavadora extends Electrodomesticos {

	private int carga=5;

	public Lavadora() {
	
	}

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Lavadora(double precioBase, String color, char consumoE, int peso, int carga) {
		super(precioBase, color, consumoE, peso);
		this.carga = carga;
	}
	//-------------------------------------------

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	//----------------------------------------------------------
	
	
}
