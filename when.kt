fun main()
{
    val day = 6
    val hari = when(day) {
        in 1..5 -> "Weekdays"
        /*2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"*/


        in 6..7 -> "Weekends"
//        7 -> "Minggu"

        else -> "Week-something"
    }
    println(hari)
}