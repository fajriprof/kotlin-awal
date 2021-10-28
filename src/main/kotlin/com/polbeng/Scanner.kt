package com.polbeng
import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    //input data
    print ("masukkan nama ")
    val nama = input.nextLine()

    print ("masukkan angka anda ")
    val nip = input.nextInt()

    //output data
    println("Selamat $nama, anda mempunyai NIP berikut $nip")
}