package celular.modelos;

public class Celular {
	public String marca;
	public double hsBateria;
	public double brilloPantalla;
	public int saldoDisp;
	
	
	public double duracionReal() {
		if(this.brilloPantalla > 0.5){
			this.hsBateria = this.hsBateria * (50 / this.brilloPantalla);
		}else if(this.brilloPantalla < 0.5) {
			this.hsBateria = this.hsBateria * (50 / this.brilloPantalla);
		}
		return this.hsBateria;
	}
}


