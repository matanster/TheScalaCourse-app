/*

package com.thescalacourse

import akka.actor.Actor
import spray.routing._
import spray.http._
import MediaTypes._
import StatusCodes._

// we don't implement our route structure directly in the service actor because
// we want to be able to test it independently, without having to spin up an actor
class ServiceActor extends Actor with Service {

  // the HttpService trait defines only one abstract member, which
  // connects the services environment to the enclosing actor or test
  def actorRefFactory = context

  // this actor only runs our route, but you could add
  // other things here, like request stream processing
  // or timeout handling
  def receive = runRoute(myRoute)
}


// this trait defines our service behavior independently from the service actor
trait Service extends HttpService {

  val myRoute =
    path("") {
      get {
        respondWithMediaType(`text/html`) { // XML is marshalled to `text/xml` by default, so we simply override here
          complete {
            <html>
              <body>
                This is the backend server for TheScalaCourse's github application. Probably, you have nothing to do here.
              </body>
            </html>
          }
        }
      }
    } ~
    path("oauth_callback") {
      get {
        respondWithMediaType(`text/html`) { // XML is marshalled to `text/xml` by default, so we simply override here
          complete { "Thanks for calling our oath callback. You should be a Github server now authorizing our app for a user, if you call in here." }          
        }
      }
    }
}

*/