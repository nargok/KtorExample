package blog

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.netty.handler.codec.DefaultHeaders


fun Application.main() {
    install(io.ktor.features.DefaultHeaders)
    install(io.ktor.features.CallLogging)
    install(io.ktor.routing.Routing) {
        get("/") {
            call.respondText("My Example Blog2", io.ktor.http.ContentType.Text.Html)
        }
    }
}