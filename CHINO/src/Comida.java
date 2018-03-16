
public class Comida {

	private String tipo_comida;
	private String nombre;
	private float precio;

	public Comida(String tipo_comida, String nombre, float precio) {
		super();
		this.tipo_comida = tipo_comida;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getTipo_comida() {
		return tipo_comida;
		
	}

	public void setTipo_comida(String tipo_comida) {
		this.tipo_comida = tipo_comida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Comida [tipo_comida=" + tipo_comida + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
}
