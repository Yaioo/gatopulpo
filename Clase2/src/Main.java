
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno juan = new Alumno();
		Alumno pedro = new Alumno("Pedro", "Diaz", 35,null);
		
		System.out.println(juan.obtenerDatos());
		juan.setNombre("Juan");
		juan.setApellido("Garcia");
		juan.setEdad(40);
		System.out.println(juan.obtenerDatos());
		System.out.println(pedro.obtenerDatos());
		System.out.println("el IVA es: "+Alumno.getIVA());
		Alumno.setIVA(27.0f);
		System.out.println("el IVA es: "+Alumno.getIVA());
		juan.getTelefonos().setTelMOvil("5555-5555-5555");
		System.out.println(juan.getTelefonos().getTelMOvil());
		System.out.println(Integer.toBinaryString(4));
	}

}
