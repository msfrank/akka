import akka.{ AkkaBuild, Dependencies, Formatting, MultiNode, Unidoc, OSGi }
import com.typesafe.tools.mima.plugin.MimaKeys

AkkaBuild.defaultSettings

Formatting.formatSettings

OSGi.distributedData

Dependencies.distributedData

//MimaKeys.previousArtifact := akkaPreviousArtifact("akka-distributed-data").value

enablePlugins(MultiNodeScalaTest)
