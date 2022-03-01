fun main()
{
    println(excludeArray())

    println(showScore())
//    println(sayHello("hi"))

//    println(Perkalian(numb_a = 11, numb_b = 5))
}

fun excludeArray()
{
//    val nilai = "D"

    var scores = arrayOf("A", "B", "C","D")

    for (score in scores)
    {
        if (score == "A")
        {
            continue
        }
        println(score)
    }
}

fun showScore()
{
    val nilai = "D"

    var score = when(nilai)
    {
        in "A".."B" -> "LULUS"

        in "C".."D" -> "REMEDIAL"

        else -> "NO"
    }
    println(score)
}

//fun sayHello(nama:String):String
//{
//    println("Hey");
//
//    return "$nama"
//}

//fun Perkalian (numb_a:Int, numb_b:Int):Int
//{
//    var hasil:Int
//
//    hasil = numb_b * numb_a
//
//    return hasil
//}