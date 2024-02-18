fun main(args: Array<String>) {
    var einAuto = Auto("Blau", "Golf ")
    var einMotorrad = Motorrad("Schwarz", "Kawasaki")
    einMotorrad.Ausgabe()
}

open class Fahrzeug( Farbe : String, AnzahlReifen : Int, Bezeichnung : String) {
    var Farbe = Farbe
    var AnzahlReifen = AnzahlReifen
    var Bezeichnung = Bezeichnung
    var Reifentyp = "sommer Reifen"

    fun Reifenwechsel()
    {
        if (Reifentyp == "sommer Reifen" ) {
            Reifentyp = "winter Reifen"
        }

        if (Reifentyp == "winter Reifen" ) {
            Reifentyp = "sommer Reifen"
        }
    }
    fun neuerLack(neuerLack : String) {
        Farbe = neuerLack
    }

    open fun Ausgabe() {
        println("Ich bin ein Fahrzeug")
    }
}

class Auto(Farbe : String, Bezeichnung : String):
    Fahrzeug(Farbe, 4, Bezeichnung) {
    override fun Ausgabe() {
        println("Ich bin ein Auto")
    }

}

class Motorrad(Farbe : String, Bezeichnung : String):
    Fahrzeug(Farbe, 2 , Bezeichnung) {
    override fun Ausgabe() {
        println("Ich bin ein Motorrad")
    }

}