package controllers;

import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

import views.html.*;

import play.mvc.*;


public class Application extends Controller {


	
	public static Result getEntities()
	{
		try
		{
			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            String result="";
            // Now connect to your databases
            DB db = mongoClient.getDB( "mdmui" );
            BasicDBObject all= new BasicDBObject();
            BasicDBObject entity= new BasicDBObject();
            entity.put("EntityName",1);
            entity.put("_id",0);
   		 	System.out.println("Connect to database successfully");
   		 	DBCollection templates =db.getCollection("templates");
            DBCursor cursor = templates.find(all,entity);
            while (cursor.hasNext())
            { 
            	result+=cursor.next().get("EntityName");
            	result+=",";
            }
            cursor.close();
            return ok(result);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public static Result getData(String EntityName)
	{
		try
		{   
			//out.println(message);
    		// To connect to mongodb server
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            String result="";
            // Now connect to your databases
            DB db = mongoClient.getDB( "mdmui" );
            BasicDBObject b= new BasicDBObject();
            b.put("EntityName", EntityName);
   		 	System.out.println("Connect to database successfully");
   		 	DBCollection mdmui=db.getCollection("templates");
            DBCursor cursor = mdmui.find(b);
            while (cursor.hasNext()) 
            { 
            	result+=cursor.next();     
            }
            cursor.close();
            return ok(result);
   		 
         }
		catch(Exception e)
		{
			e.printStackTrace();
   	  	}
		return null;
      }
	
	public static Result getForm()
	{
		try
		{
			return ok(getForm.render());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
			return null;
		
	}

}