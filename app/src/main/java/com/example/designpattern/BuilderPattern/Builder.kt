package com.example.designpattern.BuilderPattern

class Builder private constructor(
    val name: String,
    val phoneNumber: String,
    val address: String,
    val hobby: String,
    val specialty: String
) {
    data class Builder(
        var name: String = "",
        var phoneNumber: String = "",
        var address: String = "",
        var hobby: String = "",
        var specialty: String = ""
    ) {
        fun name(name: String) = apply { this.name = name }
        fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }
        fun address(address: String) = apply { this.address = address }
        fun hobby(hobby: String) = apply { this.hobby = hobby }
        fun specialty(specialty: String) = apply { this.specialty = specialty }
        fun build() = Builder(name, phoneNumber, address, hobby, specialty)
    }
}