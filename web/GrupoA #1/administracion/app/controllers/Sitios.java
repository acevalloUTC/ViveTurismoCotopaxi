package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.Sitio;
public class Sitios extends Controller {

	 public static void index() {
	        render();
	    }
	public static void sitios(){
	    	render();
	    }
public static void guardarsn(String nombre,String descripcion,String ubicacion,String imagen){
		
	Sitio cultura=new Sitio(nombre,descripcion,ubicacion,imagen);
	cultura.save();	
	sitios();
}
}