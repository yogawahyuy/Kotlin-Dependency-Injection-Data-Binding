package com.snystudio.kotlindependencyinjection

class BankNI(private val transportation: Transportation) {
    fun setTransportation():String{
        return "Perusahaan Bank BNI Menggunakan Transportasi "+transportation.pesawat()
    }
}