
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object getjson extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html ng-app>
    <head>
        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script data-main=""""),_display_(/*10.29*/routes/*10.35*/.Assets.at("javascripts/main.js")),format.raw/*10.68*/("""" src=""""),_display_(/*10.76*/routes/*10.82*/.Assets.at("lib/requirejs/require.js")),format.raw/*10.120*/(""""></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/main.js")),format.raw/*11.62*/("""" type="text/javascript"></script>
         
    </head>
   
    <body onload="extractJSON()">
    <title>
    Java to JSON
    </title>
    
    <div id="json" style="display:show">"""),_display_(/*20.42*/message),format.raw/*20.49*/("""</div>
    
       
    </body>
</html>
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Feb 04 11:53:04 IST 2015
                  SOURCE: /Users/meghana.thiyyakat/Documents/workspace/form2/app/views/getjson.scala.html
                  HASH: a2268f7ca4a960835b7c189c3f28000cfc94e555
                  MATRIX: 725->1|829->17|857->19|987->123|1001->129|1055->163|1142->224|1156->230|1208->262|1266->293|1281->299|1335->332|1370->340|1385->346|1445->384|1506->418|1521->424|1575->457|1785->640|1813->647
                  LINES: 26->1|29->1|31->3|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|38->10|38->10|38->10|39->11|39->11|39->11|48->20|48->20
                  -- GENERATED --
              */
          