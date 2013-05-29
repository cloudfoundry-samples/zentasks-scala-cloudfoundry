import sbt._
import Keys._

import play.Project._

object ApplicationBuild extends Build {

    val appName         = "zentask"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      jdbc,
      anorm, 
      "postgresql" % "postgresql" % "9.1-901-1.jdbc4", 
      "org.cloudfoundry" % "auto-reconfiguration" % "0.6.6"
	  
    )
	
    val main = play.Project(appName, appVersion, appDependencies).settings(
    // spring maven repository      
       resolvers += "Spring Milestone Repository" at "http://maven.springframework.org/milestone"
    )

}
            
