package com.tanzu.perf

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class TanzuAppSimulation extends Simulation {

  val httpProtocol = http.baseUrl("https://tanzu-app-deploy.prod.tanzu.beenotice.eu/")

  // A scenario is a chain of requests and pauses
  val scn = scenario("Main scenario")
    .exec(
      http("hello")
        .get("/api/hello")
        .check(status.is(200))
    )
    .exec(
      http("prime")
        .get("/api/prime/299756399") //900139151
        .check(status.is(200))
    )

  // https://gatling.io/docs/current/general/simulation_setup/  
  setUp(scn.inject(rampUsers(500).during(60.seconds)).protocols(httpProtocol))

}
