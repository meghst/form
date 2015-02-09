// @SOURCE:/Users/meghana.thiyyakat/Documents/workspace/form2/conf/routes
// @HASH:5b9d41001663f1c90ae4b9761438c05ed0f501f9
// @DATE:Mon Feb 09 10:48:33 IST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:8
private[this] lazy val controllers_Application_getForm0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_getForm0_invoker = createInvoker(
controllers.Application.getForm(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getForm", Nil,"GET", """get create button""", Routes.prefix + """"""))
        

// @LINE:11
private[this] lazy val controllers_Application_getEntities1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getEntities"))))
private[this] lazy val controllers_Application_getEntities1_invoker = createInvoker(
controllers.Application.getEntities(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getEntities", Nil,"GET", """get all entity names""", Routes.prefix + """getEntities"""))
        

// @LINE:13
private[this] lazy val controllers_Application_getData2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getData/"),DynamicPart("EntityName", """[^/]+""",true))))
private[this] lazy val controllers_Application_getData2_invoker = createInvoker(
controllers.Application.getData(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getData", Seq(classOf[String]),"GET", """get JSON template for "EntityName"""", Routes.prefix + """getData/$EntityName<[^/]+>"""))
        

// @LINE:18
private[this] lazy val controllers_Assets_at3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.getForm()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getEntities""","""controllers.Application.getEntities()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getData/$EntityName<[^/]+>""","""controllers.Application.getData(EntityName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:8
case controllers_Application_getForm0_route(params) => {
   call { 
        controllers_Application_getForm0_invoker.call(controllers.Application.getForm())
   }
}
        

// @LINE:11
case controllers_Application_getEntities1_route(params) => {
   call { 
        controllers_Application_getEntities1_invoker.call(controllers.Application.getEntities())
   }
}
        

// @LINE:13
case controllers_Application_getData2_route(params) => {
   call(params.fromPath[String]("EntityName", None)) { (EntityName) =>
        controllers_Application_getData2_invoker.call(controllers.Application.getData(EntityName))
   }
}
        

// @LINE:18
case controllers_Assets_at3_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     