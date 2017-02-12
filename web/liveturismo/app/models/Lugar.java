package models;

import static com.avaje.ebean.Expr.eq;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
import com.avaje.ebean.Model.Find;
import com.avaje.ebean.Model.Finder;

@Entity
public class Lugar extends Model 
{
	//private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	@Constraints.Required
	public String nomlugar;
	
	@Constraints.Required
	public String acontecimiento;

	@Constraints.Required
	public String mes;
	
	@ManyToOne
	public Canton canton;

	//paramtros id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//paramtros nomre del lugar
	public String getNomlugar() {
		return nomlugar;
	}
	public void setNomlugar(String nomlugar) {
		this.nomlugar = nomlugar;
	}
	
	//paramtros para acontecimiento
	public String getAcontecimiento() {
		return acontecimiento;
	}
	public void setAcontecimiento(String acontecimiento) {
		this.acontecimiento = acontecimiento;
	}
	
	//paramtros para los meces
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public Canton getCanton() {
		return canton;
	}
	public void setCanton(Canton canton) {
		this.canton = canton;
	}
	
	
	public static Find<Long,Lugar> find = new Finder<Long,Lugar>(Lugar.class);
	
	public static List<Lugar> findLugarPorCanton(Long lugaresIDI) 
	{
		//creamos un filtro para que slo el id que quiere el usuario
		ExpressionList<Lugar> myQuery=find.where();
		if(lugaresIDI != null)
			myQuery.add(eq("canton.id", lugaresIDI));
			
		return myQuery.findList();
	}
}
