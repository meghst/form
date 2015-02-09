// @SOURCE:/Users/meghana.thiyyakat/Documents/workspace/form2/conf/routes
// @HASH:5b9d41001663f1c90ae4b9761438c05ed0f501f9
// @DATE:Mon Feb 09 10:48:33 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:18
// @LINE:13
// @LINE:11
// @LINE:8
package controllers {

// @LINE:18
class ReverseAssets {


// @LINE:18
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:13
// @LINE:11
// @LINE:8
class ReverseApplication {


// @LINE:8
def getForm(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:13
def getData(EntityName:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getData/" + implicitly[PathBindable[String]].unbind("EntityName", dynamicString(EntityName)))
}
                        

// @LINE:11
def getEntities(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getEntities")
}
                        

}
                          
}
                  


// @LINE:18
// @LINE:13
// @LINE:11
// @LINE:8
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:18
class ReverseAssets {


// @LINE:18
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:11
// @LINE:8
class ReverseApplication {


// @LINE:8
def getForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:13
def getData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getData",
   """
      function(EntityName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getData/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("EntityName", encodeURIComponent(EntityName))})
      }
   """
)
                        

// @LINE:11
def getEntities : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getEntities",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getEntities"})
      }
   """
)
                        

}
              
}
        


// @LINE:18
// @LINE:13
// @LINE:11
// @LINE:8
package controllers.ref {


// @LINE:18
class ReverseAssets {


// @LINE:18
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:13
// @LINE:11
// @LINE:8
class ReverseApplication {


// @LINE:8
def getForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getForm(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getForm", Seq(), "GET", """get create button""", _prefix + """""")
)
                      

// @LINE:13
def getData(EntityName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getData(EntityName), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getData", Seq(classOf[String]), "GET", """get JSON template for "EntityName"""", _prefix + """getData/$EntityName<[^/]+>""")
)
                      

// @LINE:11
def getEntities(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getEntities(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getEntities", Seq(), "GET", """get all entity names""", _prefix + """getEntities""")
)
                      

}
                          
}
        
    