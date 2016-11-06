package controllers;

import play.*;
import play.mvc.*;

import views.html.*;


public class Home extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }
  
  public static Result acerca_de() {
	  
	    return ok(views.html.home.acerca_de.render());
	  }
 
  
}