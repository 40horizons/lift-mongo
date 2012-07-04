name := "LiftBasicExample"
 
scalaVersion := "2.9.1"
 
seq(webSettings :_*)

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

resolvers += "antelink.com" at "http://maven.antelink.com/content/repositories/central/"

resolvers += "uk.maven.org" at "http://uk.maven.org/maven2/"

resolvers += "ibiblio.org" at "http://mirrors.ibiblio.org/pub/mirrors/maven2/"

resolvers += "Sonatype Repository" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies += "commons-codec" % "commons-codec" % "1.6"
            
libraryDependencies ++= {
  val liftVersion = "2.4" 
  Seq(
    "net.liftweb" %% "lift-webkit"  % liftVersion % "compile->default"
  )    
}

// Customize any further dependencies as desired
libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "7.3.0.v20110203" % "container,test->default",
  "org.scala-tools.testing" % "specs_2.9.0" % "1.6.8" % "test", // For specs.org tests
  "junit" % "junit" % "4.8" % "test->default", // For JUnit 4 testing
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
  "com.h2database" % "h2" % "1.2.138", // In-process database, useful for development systems
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "compile->default",
  "org.slf4j" % "jcl-over-slf4j" % "1.6.4" // only used for debugging.
)
