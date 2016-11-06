package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.Cultural;
public class Culturales extends Controller {

	 public static void index() {
	        render();
	    }
	public static void culturales(){
	    	render();
	    }
public static void guardar(String nombre,String descripcion,String ubicacion,String imagen){
		
	Cultural cultura=new Cultural(nombre,descripcion,ubicacion,imagen);
	cultura.save();	
}
}