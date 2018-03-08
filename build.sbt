import com.typesafe.sbt.SbtScalariform.{ScalariformKeys, scalariformSettings}
import scalariform.formatter.preferences._
import com.sara.sbt.common.Dependencies._
import net.virtualvoid.sbt.graph.Plugin.graphSettings

webServiceSettings

net.virtualvoid.sbt.graph.Plugin.graphSettings

name := "testproj"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.0"

scalacOptions += "-language:postfixOps"

ivyXML := <dependencies>
  <exclude module="slf4j-log4j12"/>
  <exclude module="grizzled-slf4j_2.9.1"/>
  <exclude module="jsr311-api" />
</dependencies>

scalariformSettings

libraryDependencies += "ch.qos.logback" % "logback-classic" % "0.9.24"

libraryDependencies += "com.sara" % "social-data_2.10" % "0.0.7"

libraryDependencies += "com.sara" % "aws-utils_2.10" % "0.0.2"

libraryDependencies += "com.sara" % "messaging_2.10" % "0.0.4"

libraryDependencies += "com.sara" % "persistence_2.10" % "0.0.3"

libraryDependencies += "org.scalastic" %% "scalastic" % "0.90.10.1"

libraryDependencies += "org.elasticsearch" % "elasticsearch" % "1.1.1"

libraryDependencies += "com.paypal.sdk" % "rest-api-sdk" % "0.7.1"

libraryDependencies += "com.novocode" % "junit-interface" % "0.9" % "test"

libraryDependencies += "org.apache.httpcomponents" % "fluent-hc" % "4.3.5"


ScalariformKeys.preferences :=
  (FormattingPreferences()
    setPreference(IndentSpaces, 2)
    setPreference(AlignParameters, false)
    setPreference(AlignSingleLineCaseStatements, true)
    setPreference(DoubleIndentClassDeclaration, true)
    setPreference(RewriteArrowSymbols, true)
    setPreference(PreserveSpaceBeforeArguments, true)
    setPreference(IndentWithTabs, false))

(excludeFilter in ScalariformKeys.format) <<= excludeFilter(_ || "*Spec.scala" || "*Test.scala" || "*Specification.scala")

// port in container.Configuration := 8080
