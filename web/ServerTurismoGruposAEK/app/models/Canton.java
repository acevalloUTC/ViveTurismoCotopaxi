package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;

//entity permite realizar el mapeo de la clase para la base de datos
@Entity
public class Canton extends com.avaje.ebean.Model
{
	private static final long serialVersionUID = 1L;
	
	//creamos los campos o atributos
	@Id
	public Long id;
	
	@Constraints.Required
	public String nomcanton;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomcanton() {
		return nomcanton;
	}

	public void setNomcanton(String nomcanton) {
		this.nomcanton = nomcanton;
	}
		
	public static Find<Long,Canton> find = new Find<Long,Canton>(){};
	
	//el options find es una tabla hasmap de jva para usar en la select de list
	//( Asociar a un registro otra perteneciente a otra tabla )
	public static Map<String,String> options() 
	{
		LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
	    for(Canton c: Canton.find.orderBy("nomcanton").findList()) 
	    {
	    	options.put(c.id.toString(), c.nomcanton);
	    }
		return options;
	        
	}
}
