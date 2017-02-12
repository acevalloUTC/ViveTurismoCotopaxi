package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;
@Entity
public class Parroquia extends Model{
	@Id
    @Constraints.Min(10)
    public Long id;
	
    @Constraints.Required
    public String name;
    @ManyToOne
    public Canton canton;
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
	public Canton getCanton() {
		return canton;
	}
	public void setCanton(Canton canton) {
		this.canton = canton;
	}
    
	public static Finder<Long, Parroquia> find = new Finder<Long,Parroquia>(Parroquia.class);
    
    
}
