package dom.simple;

import org.apache.isis.applib.annotation.MemberOrder;

public class Persona {
	//  Nombre (property)
	private String nombre;
	@javax.jdo.annotations.Column(allowsNull="false")
	@MemberOrder(sequence="1")
	public String getnombe(){
		return nombre;
	}
	public void setnombre(final String nombre){
		this.nombre=nombre;
		
	}
	//Apellido property
	private String apellido;
	@javax.jdo.annotations.Column(allowsNull="false")
	@MemberOrder(sequence="2")
	
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int dni;
	
	
	@javax.jdo.annotations.Column(allowsNull="false")
	@MemberOrder(sequence="3")
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
}
