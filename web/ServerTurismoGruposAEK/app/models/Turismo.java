package models;
import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;
import com.sun.prism.Image;

import play.data.format.*;
import play.data.validation.*;
@Entity
public class Turismo  extends Model {
	@Id
    @Constraints.Min(10)
    public Long id;
	
    @Constraints.Required
    public String name;
    @Constraints.Required
    public String description;
    @Constraints.Required
    public String direccion;
    @Constraints.Required
    public String foto;
    @ManyToOne
    public  Categoria categoria;
    @ManyToOne
    public  Subcategoria subcategoria;
    @ManyToOne
    public  Canton canton;
    @ManyToOne
    public Parroquia parroquia;
    
    
    
    public Subcategoria getSubcategoria() {
		return subcategoria;
	}



	public void setSubcategoria(Subcategoria subcategoria) {
		this.subcategoria = subcategoria;
	}



	public Categoria getCategoria() {
		return categoria;
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	 public Parroquia getParroquia() {
			return parroquia;
		}



		public void setParroquia(Parroquia parroquia) {
			this.parroquia = parroquia;
		}



		public Canton getCanton() {
			return canton;
		}



		public void setCanton(Canton canton) {
			this.canton = canton;
		}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFoto() {
		return foto;
	}



	public void setFoto(String foto) {
		this.foto = foto;
	}



	public static Finder<Long, Turismo> find = new Finder<Long,Turismo>(Turismo.class);
}
