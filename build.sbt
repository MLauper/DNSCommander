name := "DNSCommander"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "dnsjava" % "dnsjava" % "2.1.1",
  "com.efsavage.twitter.bootstrap" % "bootstrap-maven" % "2.0.4"
)     

play.Project.playJavaSettings
