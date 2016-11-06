package models;
import javax.persistence.Entity;

import play.*;
import play.db.jpa.Model;
@Entity

public class Cultural extends Model{
	
	public String nombre;
	public String descripcion;
	public String ubicacion;
	public String imagen;
	
	public Cultural(String nombre, String descripcion,String ubicacion, String imagen) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ubicacion = ubicacion;
		this.imagen = imagen;
	}

}
