
public class Restaurante_chino {

private	int mesas;
private	int sillas;
private	String nombre;
private	String direccion;

	// AGREGACION CHINOS COMIDA
	Chinos chinos;
	Comida comida;

	public Restaurante_chino(int mesas, int sillas, String nombre, String direccion, Chinos chinos, Comida comida) {
		super();
		this.mesas = mesas;
		this.sillas = sillas;
		this.nombre = nombre;
		this.direccion = direccion;
		this.chinos = chinos;
		this.comida = comida;
	}

	public int getMesas() {
		return mesas;
	}

	public void setMesas(int mesas) {
		this.mesas = mesas;
	}

	public int getSillas() {
		return sillas;
	}

	public void setSillas(int sillas) {
		this.sillas = sillas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Chinos getChinos() {
		return chinos;
	}

	public void setChinos(Chinos chinos) {
		this.chinos = chinos;
	}

	public Comida getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		this.comida = comida;
	}

	@Override
	public String toString() {
		return "Restaurante_chino [mesas=" + mesas + ", sillas=" + sillas + ", nombre=" + nombre + ", direccion="
				+ direccion + ", chinos=" + chinos + ", comida=" + comida + "]";
	}

}
