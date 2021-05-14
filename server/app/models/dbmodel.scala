package models

import slick.jdbc.PostgresProfile.api._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future

class dbmodel(db: Database)(implicit ec: ExecutionContext) {

    // def showData(): Future[String] = {
    //     db.run(
    //         (for{user <- users} yield {user}).result
    //     )
    // }

}