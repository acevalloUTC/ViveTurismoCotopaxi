package models;
import play.*;
import play.db.jpa.Model;

public class Natural extends Model {
	public String nombre;
	public String descripcion;
	public String ubicacion;
	public String imagen;
	
	public Natural(String nombre, String descripcion,String ubicacion, String imagen) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ubicacion = ubicacion;
		this.imagen = imagen;
	}

}
