package com.belajar.retrofit

import com.google.gson.annotations.SerializedName

data class PostResponse(
    val id : Int,
    val title : String?,
    @SerializedName("body")
//    @SerializedName("content")
    val text : String?
)