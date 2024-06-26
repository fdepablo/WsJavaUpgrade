package entidades;

public abstract class Personaje {
	private String nombre;
	private int vida;
	private Arma arma;
	
	public abstract void atacar(Personaje p);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", arma=" + arma + "]";
	}
	
	
}

