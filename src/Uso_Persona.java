import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado("Pablo", 25000.0);
		lasPersonas[1]=new Alumno("German", "Desarrollo Web");
		
		for(Persona p: lasPersonas) {
			System.out.println(p.dameDescripcion());
		}
	}

}

abstract class Persona{
	private String nombre;
	
	public Persona (String nombre) {
		this.nombre=nombre;
	}
	
	public String dameNombre() {
		return this.nombre;
	}
	
	public abstract String dameDescripcion();
}


class Empleado extends Persona{
	private Double sueldo;
	private Integer id;
	
	public Empleado(String nombre, Double sueldo) {
		super(nombre);
		this.sueldo=sueldo;
	}
	
	public Double dameSueldo() {
		return this.sueldo;
	}
	
	public void subeSueldo(Double incremento) {
		this.sueldo=this.sueldo+this.sueldo*incremento/100;
	}
	
	public String dameDescripcion() {
		return "-Empleado-\nNombre: "+this.dameNombre()+"\nSueldo: "+this.sueldo;
	}
}

class Alumno extends Persona{
	private String carrera;
	
	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;
	}
	
	public String dameDescripcion() {
		return "\n-Alumno-\nNombre: "+this.dameNombre()+"\nCarrera: "+this.carrera;
	}
}
