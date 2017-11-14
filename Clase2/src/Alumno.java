
public class Alumno {

	private String nombre;
	private String apellido;
	private Integer edad;
	private static Float IVA;
	private Telefono telefonos;
	private String calle;
	private String numero;
	private String piso;
	private String departamento;
	private String ciudad;
	private Direccion direccion;

	
	
	public Alumno() {
		
		this("","",null,null);
		/*
		this.nombre="";
		this.apellido="";
		this.edad=null;
		setIVA(21.0f);
		*/
	}
	public Alumno(String nombre,String apellido, Integer edad, Direccion direccion){
	
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		setIVA(21.0f);
		this.setTelefonos(new Telefono("","",""));
		direccion= direccion;
				
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public static Float getIVA() {
		return IVA;
	}
	public static void setIVA(Float iVA) {
		IVA = iVA;
	}
		
	public Telefono getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Telefono telefonos) {
		this.telefonos = telefonos;
	}
	
	public String obtenerDatos() {
		
		return this.getNombre()+" "+this.getApellido()+" "+this.getEdad();
	}
	
}