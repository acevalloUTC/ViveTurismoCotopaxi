package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import models.Paramo;

public class Paramos extends Controller {

	public static void index() {
        render();
    }
	public static void paramos(){
    	render();
    }
    
    public static void guardarparamo(String nombre, String descripcion, String ubicacion, String imagen){
    	Paramo param = new Paramo(nombre, descripcion, ubicacion, imagen);
    	param.save();
    	paramos();
    }

}