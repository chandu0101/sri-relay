import LauncherConfigs._
import CommonUtils._
import PublicationDetails._
import Dependencies._



// ================================ Module definitions  ================================ //

lazy val SriRelay = DefProject(".", "SriRelay")
  .aggregate(relay,relayWebExamples, relayMobileExamples)
  .settings(preventPublication)


lazy val relay = DefProject("relay")
  .settings(publicationSettings)
  .settings(relayModuleDeps)


lazy val relayWebExamples = DefProject("relay-web-examples")
  .dependsOn(relay)
  .settings(relayWebExamplesLauncher)
  .settings(relayWebExamplesModuleDeps)
  .settings(preventPublication)


lazy val relayMobileExamples = DefProject("relay-mobile-examples")
  .dependsOn(relay)
  .settings(mobileRelayLauncher)
  .settings(relayMobileExamplesModuleDeps)
  .settings(preventPublication)



// workaround http://stackoverflow.com/questions/20931217/deprecation-and-feature-warnings-for-sbt-project-definition-files

scalacOptions ++= Seq("-unchecked", "-deprecation")