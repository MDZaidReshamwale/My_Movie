package com.zaid.mymovie.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import org.intellij.lang.annotations.Language

@Parcelize
data class Movie (
    @SerializedName("id")
    val id : String ?,

    @SerializedName("title")
    val title : String?,

    @SerializedName("original_language")
    val language : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("release_date")
    val releaseDate : String?


 ) : Parcelable {
    constructor() : this("", "", "", "", "")
}