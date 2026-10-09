class Solution {
    val a1 = '('
    val a2 = ')'

    val b1 = '{'
    val b2 = '}'

    val c1 = '['
    val c2 = ']'

    fun partner(c: Char): Char {
        return when (c) {
            a1 -> a2
            b1 -> b2
            c1 -> c2
            else -> '?'
        }
    }

    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (c in s) {
            if (c == a1 || c == b1 || c == c1) {
                stack.addLast(c)
            } else {
                if (stack.isEmpty()) return false
                val last = stack.removeLast()
                val p = partner(last)
                if (p != c) return false
            }
        }
        return stack.isEmpty()
    }
}
