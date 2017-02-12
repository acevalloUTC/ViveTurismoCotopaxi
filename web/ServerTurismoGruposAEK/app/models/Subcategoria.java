package models;
import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;
@Entity
public class Subcategoria extends Model{
	@Id
    @Constraints.Min(10)
    public Long id;
	
    @Constraints.Required
    public String name;
    @ManyToOne
    public Categoria categoria;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
    
	public static Finder<Long, Subcategoria> find = new Finder<Long,Subcategoria>(Subcategoria.class);
    
    
}
