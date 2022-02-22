fun main() {
    var students = arrayOf(
        "Adventy", "Angel", "Alvina", "Kelvin", "Ricardo", "Steven", "Sefryanto", "Stenly",
        "Sukarta", "Suryanto", "Tasya")

    for (student in students) {
        if (student == "Adventy") {
            continue
        }
        println(student)
    }
}
