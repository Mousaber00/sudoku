package org.example


fun main() {

}
fun tableValidation(table: Array<CharArray>): Boolean {
    val seenRows = mutableSetOf<Char>()
    val seenColumns = mutableSetOf<Char>()
    // Check the table has 3*3 Grid Layout
    if (table.size != 3) return false
    for (row in table) {
        if (row.size != 3) return false
    }
    //Check The Table Rows
    for (row in table) {

        for (number in row) {
            if (number == '-') continue
            if (number.isDigit().not() || number == '0') return false
            if (number in seenRows) return false
            seenRows.add(number)
        }
    }
//Check The Table Columns
    for (ccolumn in table[0].indices) {

        for (cell in table.indices) {

            val currentChar = table[cell][ccolumn]

            if (currentChar == '-') continue
            if (seenColumns.contains(currentChar)) {
                println("current $currentChar")
                return false
            }
            seenColumns.add(currentChar)
        }
    }
    return true
}