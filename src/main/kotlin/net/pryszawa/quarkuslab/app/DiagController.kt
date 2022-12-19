package net.pryszawa.quarkuslab.app

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

@Path("/api/diag")
class DiagController {

    @GET
    @Path("/echo/{msg}")
    @Produces(MediaType.TEXT_PLAIN)
    fun getEcho(@PathParam("msg") msg: String, @QueryParam("username") username: String?): String =
        "Hello $username ECHO $msg"

}
