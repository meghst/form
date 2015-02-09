name := """form2"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
   "org.webjars" % "angularjs" % "1.3.0-beta.2",
  "org.webjars" % "jquery" % "2.0.3"
)

