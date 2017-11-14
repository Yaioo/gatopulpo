
public class Direccion {

	private String calle;
	private String numero;
	private String piso;
	private String departamento;
	private String ciudad;
	private String provincia;
	
	
	public Direccion(String calle, String numero, String piso, String departamento, String ciudad, String provincia) {
		
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getPiso() {
		return piso;
	}


	public void setPiso(String piso) {
		this.piso = piso;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String toString() {
		return "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", departamento=" + departamento
				+ ", ciudad=" + ciudad + ", provincia=" + provincia ;
	}

	
}
