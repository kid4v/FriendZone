package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import models.*;
import views.html.*;

public class Application extends Controller {
  
	static Form<Task> taskForm = Form.form(Task.class);

    public static Result index() {
        return ok("Hello world");
    }
  
    
    public static Result login() {
    	return TODO;
    }
}
