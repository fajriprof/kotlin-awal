package com.polbeng
import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    //input data
    print ("masukkan nilai Rupiah ")
    val rupiah:Double = input.nextDouble()
    val dolar = rupiah/15000
    //output data
    println("Nilai dolar = Rp $rupiah = $dolar Dolar ")
}