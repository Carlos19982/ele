package electro;

public class Electrodomesticos {

	
	private double PrecioBase=100;
	private String color="Blanco";
	private char ConsumoE='f';
	private int Peso=5;
	
	public Electrodomesticos(double precioBase, String color, char consumoE, int peso) {
		super();
		PrecioBase = precioBase;
		this.color = comprobarColor(color);
		ConsumoE = comprobarConsumoEnergetico(consumoE);
		Peso = peso;
	}

	public Electrodomesticos(double precioBase, int peso) {
		super();
		PrecioBase = precioBase;
		Peso = peso;
	}
	
	
	public Electrodomesticos() {
		
	}
	//------------------------------

	public double getPrecioBase() {
		return PrecioBase;
	}

	public void setPrecioBase(double precioBase) {
		PrecioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoE() {
		return ConsumoE;
	}

	public void setConsumoE(char consumoE) {
		ConsumoE = consumoE;
	}

	public int getPeso() {
		return Peso;
	}

	public void setPeso(int peso) {
		Peso = peso;
	}
	//--------------------------------------------
	public char comprobarConsumoEnergetico(char letra){
		if(letra != 'A' && letra != 'B'  && letra != 'C'  && letra != 'D' && letra != 'E' && letra != 'F') {
			letra='F';
		}
		return letra;
		
	}
	public String comprobarColor(String color) {
		//: blanco, negro, rojo, azul y gris
		
		if("blanco".equals(color) || "negro".equals(color) || "rojo".equals(color) || "azul".equals(color) || "gris".equals(color)) {
			
			this.color=color;
			System.out.println("Color "+color+ " elegido");
			
		}else {
			color="blanco";
			System.out.println("Color por defecto elegido"+"\n"+"Color: "+color);
		}
		return color;
	}
	public void precioFinal() {
		int contador=0;
		int precios=0;
		char[]letras= {'A','B','C','D','E','F'};
		int[]precio= {100,80,60,50,30,10};
		
		for(int i=0;i<letras.length;i++) {
			if(ConsumoE==letras[i]) {
				contador=i;
			}
		}
		
		PrecioBase=PrecioBase+precio[contador];
		
		if(Peso>=0 && Peso<=19) {
			PrecioBase+=10;
		}else if(Peso>=20 && Peso<=49) {
			PrecioBase+=50;
		}else if( Peso>=50 && Peso<=79) {
			PrecioBase+=80;
		}else if(Peso<80) {
			PrecioBase+=100;
		}
			
		System.out.println(PrecioBase);
		
	}
	
	
	
	
	
	
	
}
