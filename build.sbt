import AssemblyKeys._

name := "skype-export"

organization  := "com.github.maqdev"

version       := "0.1.0"

scalaVersion  := "2.11.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= {
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  Seq(
    "org.xerial" % "sqlite-jdbc" % "3.8.7",
    "com.google.guava" % "guava" % "16.0.1"
  )
}

Revolver.settings ++ assemblySettings
