package com.project.models

data class UserInfoResponse(
    var success: Boolean = false,
    var message: String? = null,
    var userInfo: UserInfo? = null,
)
