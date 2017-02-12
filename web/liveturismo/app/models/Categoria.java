package models;
import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;
@Entity
public class Categoria extends Model{
	@Id
    @Constraints.Min(10)
    public Long id;
	
    @Constraints.Required
    public String name;

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
    
	public static Finder<Long, Categoria> find = new Finder<Long,Categoria>(Categoria.class);
    
    
}
