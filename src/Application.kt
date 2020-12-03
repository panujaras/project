package com.project

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)


fun Application.module() {

    install(DefaultHeaders)
    install(CallLogging)

    install(ContentNegotiation) {
        gson {
        }
    }

    install(Routing) {
        get(path = "/api/projact/user"){
            val userInfo =UserInfo(name = "Dru sp",age = 99,degree = null)
            val user = User(success = true,message = "Fetch user info success",userInfo = userInfo)
            call.respond(user)
        }

    }
}
data class User(
    var success:Boolean? = null,
    var message:String? = null,
    var userInfo:UserInfo?=null,
)

data class UserInfo(
    var name:String? = null,
    var age:Int? = null,
    var degree:Any?=null,
)
