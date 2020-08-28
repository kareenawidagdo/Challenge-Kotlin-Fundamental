import java.util.Scanner;

fun main() {
    //objek Scanner
    val input = Scanner(System.`in`)

    println("====================")
    print("Nama : ")
    input.nextLine()
    print("Kelas : ")
    input.nextLine()
    print("No. Absen : ")
    input.nextInt()
    println("====================\n")

    print("""
        ***** MENGHITUNG BANGUN RUANG BERALAS LINGKARAN *****
        
        1) Volume Kerucut
        2) Volume Tabung
        
        Pilih menu : 
    """.trimIndent())

    val volMenu: Int = input.nextInt()

    val Pilihan: Any
    Pilihan = if (volMenu == 1) {
        println("\n----- Menghitung Volume Kerucut -----\n")
        //input rad dan tinggi kerucut
        print("Jari-Jari Kerucut : ")
        val rad: Double = input.nextDouble()
        print("Tinggi Kerucut : ")
        val tinggi: Double = input.nextDouble()

        //output: hasil perhitungan dibulatkan 2 angka di belakang koma
        print("Volume kerucut adalah ")
        print(String.format("%.2f",kerucut(rad, tinggi)))
        println(" cm^3.\n")
    } else if (volMenu == 2) {
        println("\n----- Menghitung Volume Tabung -----\n")
        //input rad dan tinggi tabung
        print("Jari-Jari Tabung : ")
        val rad: Double = input.nextDouble()
        print("Tinggi Tabung : ")
        val tinggi: Double = input.nextDouble()

        //output: hasil perhitungan dibulatkan 2 angka di belakang koma
        print("Volume tabung adalah ")
        print(String.format("%.2f",tabung(rad, tinggi)))
        println(" cm^3.\n")
    } else {
        //output jika input != 1 or 2
        println("undefined input.")
    }

    print(Pilihan)
}

fun kerucut(rad: Double, tinggi: Double): Double {
    val volCone: Double = 3.14 * rad * rad * tinggi / 3
    return volCone
}

fun tabung(rad: Double, tinggi: Double): Double {
    val volSilinder: Double = 3.14 * rad * rad * tinggi
    return volSilinder
}