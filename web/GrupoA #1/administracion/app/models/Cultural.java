package models;
import javax.persistence.Entity;

import play.*;
import play.db.jpa.Model;
@Entity

public class Cultural extends Model{
	public String Id;
	public String Nombre;
	public String Descripcion;
	public String Ubicacion;
	public String Imagen;
	
	public Cultural(String id, String nombre, String descripcion,String ubicacion, String imagen) {
		super();
		this.Id = id;
		this.Nombre = nombre;
		this.Descripcion = descripcion;
		this.Ubicacion = ubicacion;
		this.Imagen = imagen;
	}

}
