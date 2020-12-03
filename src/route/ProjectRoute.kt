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

fun Route.userInfo(){

}
