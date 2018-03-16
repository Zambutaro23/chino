
public class Chinos {

	private String nombres;
	private String puestos;
	private String sexo;

	public Chinos(String nombres, String puestos, String sexo) {
		super();
		this.nombres = nombres;
		this.puestos = puestos;
		this.sexo = sexo;

	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPuestos() {
		return puestos;
	}

	public void setPuestos(String puestos) {
		this.puestos = puestos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Chinos [nombres=" + nombres + ", puestos=" + puestos + ", sexo=" + sexo + "]";
	}
}
