package com.example

import android.os.Parcel
import android.os.Parcelable

//kita mengirimkan datanya dari activity ke activity kedua
class Sensei(
    val NameSensei:String?,
    val email:String?,
    val Banyakistri:Int?
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(NameSensei)
        parcel.writeString(email)
        parcel.writeValue(Banyakistri)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Sensei> {
        override fun createFromParcel(parcel: Parcel): Sensei {
            return Sensei(parcel)
        }

        override fun newArray(size: Int): Array<Sensei?> {
            return arrayOfNulls(size)
        }
    }
}