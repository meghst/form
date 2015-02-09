package controllers;

import static java.lang.System.out;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	private static Map<String, Object> fields= new HashMap<String, Object>();
    public static Result getjson() {
    	
    	try
    	{
    		Class c= Class.forName("controllers.User");
    		
    		populateHashMap(c.getDeclaredFields());
    		String JSON=convertToJSON();
    		return ok(getjson.render(JSON));
    	} 
    	catch (ClassNotFoundException x) 
    	{
    		x.printStackTrace();
    	}
		return null;
    	
        
    }
    
    public static String convertToJSON()
    {
    	ObjectMapper objectMapper = new ObjectMapper();
    	try {
			 String JSON=objectMapper.writeValueAsString(fields);
			 return JSON;
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
    	
    	
    	
    }

    private static void populateHashMap(Member[] mbrs) {
	//out.format("%s:%n", s);
	for (Member mbr : mbrs) {
	    if (mbr instanceof Field)
	    {
	    	String[] declaration= ((Field)mbr).toGenericString().split(" ");
	    	fields.put(declaration[2],declaration[1]);
	    	out.format("  %s%n", ((Field)mbr).toGenericString());
	    }
	}
	if (mbrs.length == 0)
	    out.format("  -- No Fields -- ");
	out.format("%n");
    }


}

class User
{
    public String email;
    public String password;

}