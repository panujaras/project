package com.project.route

import com.project.models.UserInfo
import com.project.models.UserInfoResponse
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.user() {
    get(path = "/api/project/user") {
        val userInfo = UserInfo(name = "Dru sp", age = 99)
        val response = UserInfoResponse(success = true, message = "Fetch user info success", userInfo = userInfo)
        call.respond(response)
    }
}

// ctrl + shift + P
fun Route.userInfo(){
    get(path = "/api/project/userInfo") {
        // input
        val name = call.parameters["name"]
        val age = call.parameters["age"]?.toInt()

        // output
        val userInfo = UserInfo(name = name, age = age)
        val response = UserInfoResponse(success = true, message = "Fetch user info success", userInfo = userInfo)
        call.respond(response)
    }
}
