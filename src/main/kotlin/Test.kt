package org.example

fun main() {
    //Valid cases
    test(
        title = "When The Table Is Empty",
        result = tableValidation(
            table = arrayOf(
                charArrayOf('-', '-', '-'),
                charArrayOf('-', '-', '-'),
                charArrayOf('-', '-', '-'),
            )
        ),
        expectedResult = true,
    )
    test(
        title = "When The Table Is Valid",
        result = tableValidation(
            table = arrayOf(
                charArrayOf('-', '-', '-'),
                charArrayOf('-', '5', '-'),
                charArrayOf('-', '-', '4'),
            )
        ),
        expectedResult = true,
    )
    test(
        title = "When The Table Is Completed",
        result = tableValidation(
            table = arrayOf(
                charArrayOf('1', '2', '3'),
                charArrayOf('4', '5', '6'),
                charArrayOf('7', '8', '9'),
            )
        ),
        expectedResult = true,
    )

    //invalid cases
    test(
        title = "When The Table Contains A Duplicated Number In The Same Row",
        result = tableValidation(
            table = arrayOf(
                charArrayOf('1', '1', '-'),
                charArrayOf('-', '-', '-'),
                charArrayOf('-', '-', '-'),
            )
        ),
        expectedResult = false,
    )
    test(
        title = "When The Table Contains A Duplicated Number In The Same Column",
        result = tableValidation(
            table = arrayOf(
                charArrayOf('1', '-', '-'),
                charArrayOf('1', '-', '-'),
                charArrayOf('-', '-', '-'),
            )
        ),
        expectedResult = false,
    )
    test(
        title = "When The Table Contains A Duplicated Number In The Same Box",
        result = tableValidation(
            table = arrayOf(
                charArrayOf('1', '-', '-'),
                charArrayOf('-', '-', '-'),
                charArrayOf('-', '-', '1'),
            )
        ),
        expectedResult = false,
    )
    test(
        title = "When The Table Contains Any Character Instead of A Number",
        result = tableValidation(
            table = arrayOf(
                charArrayOf('1', 'A', '-'),
                charArrayOf('-', '#', '-'),
                charArrayOf('-', '-', '-'),
            )
        ),
        expectedResult = false,
    )
    test(
        title = "When The Table Contains Zero",
        result = tableValidation(
            table = arrayOf(
                charArrayOf('0', '-', '-'),
                charArrayOf('-', '5', '-'),
                charArrayOf('-', '-', '-'),
            )
        ),
        expectedResult = false,
    )
    test(
        title = "When The Number Is Outside Rows Grid Layout",
        result = tableValidation(
            table = arrayOf(
                charArrayOf('1'),
                charArrayOf('-', '-', '-'),
                charArrayOf('-', '5', '-'),
                charArrayOf('-', '-', '-'),
            )
        ),
        expectedResult = false,
    )
    test(
        title = "When The Number Is Outside Columns Grid Layout",
        result = tableValidation(
            table = arrayOf(
                charArrayOf('1', '-', '-', '4'),
                charArrayOf('-', '-', '-'),
                charArrayOf('-', '-', '-'),
            )
        ),
        expectedResult = false,
    )
}

fun test(title: String, result: Boolean, expectedResult: Boolean) {
    if (result == expectedResult) {
        println("Success_ $title")
    } else {
        println("Failed _ $title")
    }
}