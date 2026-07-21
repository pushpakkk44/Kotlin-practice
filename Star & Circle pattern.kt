///STAR pattern
/*fun main() {
    val rows = 6

    for (i in 0 until rows) {

        // Print spaces
        for (j in 0 until i) {
            print(" ")
        }

        // Print stars
        for (j in 0 until (rows - i)) {
            print("* ")
        }

        println()
    }
} */

///star circle
/*fun main() {
    val r = 5

    for (i in -r..r) {
        for (j in -r..r) {

            val dis = i * i + j * j

            if (dis >= r * r - 2 && dis <= r * r + 2) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }
}*/