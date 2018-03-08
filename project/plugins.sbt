scalacOptions += "-deprecation"

credentials ++= Seq(
  Credentials("Sara Server", "www.saraframework.com", "saradeveloper", "teamkp"))

resolvers += Resolver.url("sbt-plugin-snapshots",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-snapshots/"))(
  Resolver.ivyStylePatterns)

resolvers += Resolver.url("Sara Ivy", url("http://www.saraframework.com/artifactory/ivy"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.0.0")

addSbtPlugin("com.sara.sbt" % "web-service" % "1.0.4")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.2")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.3")
