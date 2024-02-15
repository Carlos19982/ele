package electro;

public class Televisor extends Electrodomesticos {

		private int pulgadas=20;
		private Boolean SintonizadorTDT=false;
		
		public Televisor() {
			
		}

		public Televisor(double precioBase, String color, char consumoE, int peso, int pulgadas,Boolean sintonizadorTDT) {
			super(precioBase, color, consumoE, peso);
			this.pulgadas = pulgadas;
			SintonizadorTDT = sintonizadorTDT;
		}

		public Televisor(double precioBase, int peso) {
			super(precioBase, peso);
		}
		//-----------------------------------------------------

		public int getPulgadas() {
			return pulgadas;
		}

		public void setPulgadas(int pulgadas) {
			this.pulgadas = pulgadas;
		}

		public Boolean getSintonizadorTDT() {
			return SintonizadorTDT;
		}

		public void setSintonizadorTDT(Boolean sintonizadorTDT) {
			SintonizadorTDT = sintonizadorTDT;
		}
		//----------------------------------------------
		
	
		
	
}
