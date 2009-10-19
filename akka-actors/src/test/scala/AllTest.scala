package se.scalablesolutions.akka

import junit.framework.Test
import junit.framework.TestCase
import junit.framework.TestSuite

import se.scalablesolutions.akka.actor.{RemoteActorSpec, InMemoryActorSpec, ThreadBasedActorSpec, SupervisorSpec, RemoteSupervisorSpec, SchedulerSpec}
import se.scalablesolutions.akka.dispatch.{EventBasedSingleThreadDispatcherTest, EventBasedThreadPoolDispatcherTest}

object AllTest extends TestCase {
  def suite(): Test = {
    val suite = new TestSuite("All Scala tests")
    suite.addTestSuite(classOf[SupervisorSpec])
    suite.addTestSuite(classOf[RemoteSupervisorSpec])
    suite.addTestSuite(classOf[EventBasedSingleThreadDispatcherTest])
    suite.addTestSuite(classOf[EventBasedThreadPoolDispatcherTest])
    suite.addTestSuite(classOf[ThreadBasedActorSpec])
    suite.addTestSuite(classOf[EventBasedSingleThreadDispatcherTest])
    suite.addTestSuite(classOf[EventBasedThreadPoolDispatcherTest])
    suite.addTestSuite(classOf[RemoteActorSpec])
    suite.addTestSuite(classOf[InMemoryActorSpec])
    suite.addTestSuite(classOf[SchedulerSpec])
    //suite.addTestSuite(classOf[TransactionClasherSpec])
    suite
  }

  def main(args: Array[String]) = junit.textui.TestRunner.run(suite)
}