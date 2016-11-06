package controllers;
import play.*;
import play.mvc.*;

import java.util.*;

import models.*;


public class Naturales extends Controller {

	 public static void index() {
	        render();
	    }
	public static void naturales(){
	    	render();
	    }
public static void guardar(String nombre,String descripcion,String ubicacion,String imagen){
		
	Natural natural=new Natural(nombre,descripcion,ubicacion,imagen);
	natural.save();	
	naturales();
}
}