package com.snystudio.kotlindependencyinjection

class Telkom(private val transportation: Transportation) {
    fun setTransportation():String{
        return "Perusahaan Telkom Indonesia Menggunakan Transportasi "+transportation.keretaApi()
    }
}