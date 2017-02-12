package controllers;

import java.util.List;

import models.Canton;
import models.Categoria;
import models.Lugar;
import models.Parroquia;
import models.Subcategoria;
import models.Turismo;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public Result atractivos(){  
    	List<Turismo>tur=Turismo.find.all();
    	List<Canton> categ = Canton.find.all();
    	List<Parroquia> sub = Parroquia.find.all();
    	List<Categoria> categ1 = Categoria.find.all();
    	List<Subcategoria> sub1 = Subcategoria.find.all();
    	return ok(atractivos.render(tur,categ,sub,categ1,sub1));
    }
    public Result calendario(){
    	List<Lugar> lugar1 = Lugar.findLugarPorCanton(1L);
    	return ok(calendario.render(lugar1,Canton.find.all()));
    }
    
    public Result logincalendario(){     
        return ok(logincalendario.render());
    }
    
    /////// crud Atractivos /////////////////////////////////
    
    public Result save(){
   	 DynamicForm form = Form.form().bindFromRequest();
   	String namet=form.get("name");
   	String description_t=form.get("description");
 
   	String direction_t=form.get("direccion");
   	String fot_t=form.get("foto");
   	
   	String cat_t=form.get("cat");
   	String sub_t=form.get("sub");
   	String cat1_t=form.get("cat1");
   	String sub1_t=form.get("sub1");
   	Long id_cat=Long.parseLong(cat_t);
   	Long id_sub=Long.parseLong(sub_t);
   	Long id_cat1=Long.parseLong(cat1_t);
   	Long id_sub1=Long.parseLong(sub1_t);
   	
   	Canton cat = Canton.find.ref(id_cat);
   	Parroquia sub = Parroquia.find.ref(id_sub);

   	Categoria cat1 = Categoria.find.ref(id_cat1);
   	Subcategoria sub1 = Subcategoria.find.ref(id_sub1);
   	
   	Turismo tur=new Turismo();
   	tur.name=namet;
   	tur.description=description_t;
   	tur.direccion=direction_t;
   	tur.foto=fot_t;
   	
   	
   	tur.canton=cat;
   	tur.parroquia=sub;
   	

   	tur.categoria=cat1;
   	tur.subcategoria=sub1;
   	
   	tur.save();
   	flash("ok","Lugar turistico guardado exitosamente");
   	return redirect(controllers.routes.HomeController.atractivos());
   }
   
   public Result delete(Long id) {
       Turismo.find.ref(id).delete();
       flash("ok", "Lugar turistico eliminado exitosamente");
       return redirect(controllers.routes.HomeController.atractivos());
   }
   public Result edit(Long id) {
   	Turismo tur = Turismo.find.ref(id);
   	List<Canton> categ = Canton.find.all();
   	List<Parroquia> sub = Parroquia.find.all();
   	List<Categoria> categ1 = Categoria.find.all();
   	List<Subcategoria> sub1 = Subcategoria.find.all();
       return ok(edit.render(tur,categ,sub,categ1,sub1));
   }
   
 
   public Result update(){
  	 	DynamicForm form = Form.form().bindFromRequest();
	   	String id_t=form.get("idt");
	   	String namet=form.get("name");
	   	String description_t=form.get("description");
	   	String fot_t=form.get("foto");
	   	String direction_t=form.get("direccion");
	   	
	   	
	   	String cat_t=form.get("cat");
   	String sub_t=form.get("sub");
   	String cat1_t=form.get("cat1");
   	String sub1_t=form.get("sub1");
   	Long id_cat=Long.parseLong(cat_t);
   	Long id_sub=Long.parseLong(sub_t);
   	Long id_cat1=Long.parseLong(cat1_t);
   	Long id_sub1=Long.parseLong(sub1_t);
   	
   	Canton cat = Canton.find.ref(id_cat);
   	Parroquia sub = Parroquia.find.ref(id_sub);
   	Categoria cat1 = Categoria.find.ref(id_cat1);
   	Subcategoria sub1 = Subcategoria.find.ref(id_sub);
   	
   	
	   	
	   	Long id=Long.parseLong(id_t);
	   	Turismo tur = Turismo.find.ref(id);
	   
	   	tur.delete();
	   	tur=new Turismo();
	   	tur.name=namet;
	   	tur.description=description_t;
	   	
	   	
	   	tur.direccion=direction_t;
	   	tur.foto=fot_t;
		tur.canton=cat;
   	tur.parroquia=sub;
   	tur.categoria=cat1;
   	tur.subcategoria=sub1;
   	
   	
	   	tur.save();
	   	flash("ok","Lugar turistico actualizado exitosamente");
	   	return redirect(controllers.routes.HomeController.atractivos());
  }

    
   ///////////// CRUD DE CALENDARIOS ///////////////
    
    public Result lugar() 
    {
    	List<Canton> canton1 = Canton.find.all();
    	List<Lugar> lugar1 = Lugar.find.all();
        return ok(lugar.render(canton1,lugar1));
    }
    
    public Result canton() 
    {
    	List<Canton> canton1 = Canton.find.all();
        return ok(canton.render(canton1));
    }
    
    //crud de lugar
    //metodo para poder guardar los datos de lugar
    public Result saveLugar()
    {
    	DynamicForm form = Form.form().bindFromRequest();
    	String nomlugar_lugar = form.get("nomlugar");
    	String acontecimiento_lugar = form.get("acontecimiento");
    	String mes_lugar = form.get("mes");
   	
    	String canton_lugar = form.get("canton");
    	Long id_canton=Long.parseLong(canton_lugar);
    	Canton cat = Canton.find.ref(id_canton);
   	
    	Lugar lug = new Lugar();
    	lug.nomlugar=nomlugar_lugar;
    	lug.acontecimiento=acontecimiento_lugar;
    	lug.mes=mes_lugar;
    	lug.canton=cat;
   	
    	lug.save();
    	flash("ok","Lugar turistico guardado exitosamente");
    	return redirect(controllers.routes.HomeController.lugar());
    }
    
    //metodo para poder guardar los datos de canton
    public Result saveCanton()
    {
    	DynamicForm form = Form.form().bindFromRequest();
    	String nomcanton_canton = form.get("nomcanton");
   	
    	Canton cant = new Canton();
    	cant.nomcanton=nomcanton_canton;
   	
    	cant.save();
    	flash("ok","Registro guardado exitosamente");
    	return redirect(controllers.routes.HomeController.canton());
    }
    
    //metodo para editar
    public Result editarlugar(Long id) 
    {
    	Lugar lugaredit = Lugar.find.ref(id);
    	List<Canton> canton1 = Canton.find.all();
        return ok(editarlugar.render(lugaredit,canton1));
    }
   
    //metodo para poder guardar los datos actualizados de lugar 
    public Result updatelugar()
    {
    	DynamicForm form = Form.form().bindFromRequest();
    	String id_lugar=form.get("id");
   	    String nomlugar_lugar = form.get("nomlugar");
   	    String acontecimiento_lugar = form.get("acontecimiento");
   	    String mes_lugar = form.get("mes");
  	
   	    String canton_lugar = form.get("canton");
   	    Long id_canton=Long.parseLong(canton_lugar);
   	    Canton cat = Canton.find.ref(id_canton);
   	    
   	    Long id =Long.parseLong(id_lugar);
   	    Lugar lug = Lugar.find.ref(id);
   	    lug.delete();
   	    
   	    lug = new Lugar();
   	    lug.nomlugar=nomlugar_lugar;
   	    lug.acontecimiento=acontecimiento_lugar;
   	    lug.mes=mes_lugar;
   	    lug.canton=cat;
  	
   	    lug.update();
   	    flash("ok","Registro actualozado exitosamente");
   	    return redirect(controllers.routes.HomeController.index());
    }
    
    //metodo para editar
    public Result editarcanton(Long id) 
    {
    	Canton editcanton = Canton.find.ref(id);
        return ok(editarcanton.render(editcanton));
    }
    
  //metodo para poder guardar los datos actualizados de lugar 
    public Result updatecanton()
    {
    	DynamicForm form = Form.form().bindFromRequest();
    	String id_canton=form.get("id");
   	    String nomcanton_canton = form.get("nomcanton");
    	
   	    Long id =Long.parseLong(id_canton);
   	    Canton cant = Canton.find.ref(id);
   	    cant.delete();
	    
    	cant = new Canton();
    	cant.nomcanton=nomcanton_canton;
    	cant.save();
   	    flash("ok","Registro actualozado exitosamente");
   	    return redirect(controllers.routes.HomeController.index());
    }
    
    //metodo para poder eliminar un registro
    public Result deleteLugar(Long id) 
    {
    	Lugar.find.ref(id).delete();
    	flash("ok", "Registro eliminado exitosamente");
    	return redirect(controllers.routes.HomeController.index());
    }
    
  //metodo para poder eliminar un registro
    public Result deleteCanton(Long id) 
    {
    	Canton.find.ref(id).delete();
    	flash("ok", "Registro eliminado exitosamente");
    	return redirect(controllers.routes.HomeController.canton());
    }
    
    
    //Json de id
    public Result jsonLugar()
    {
    	String lugaresIDS = request().getQueryString("id");
    	Long lugaresIDI = Long.parseLong(lugaresIDS);
    	
    	//creamos una lista
    	List<Lugar> lugares = Lugar.findLugarPorCanton(lugaresIDI);
    	
    	    	//retornamos el json para mostrar los datos
    	return ok(Json.toJson(lugares));
    }

}
