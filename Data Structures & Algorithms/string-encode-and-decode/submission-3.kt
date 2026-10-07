class Solution {

    fun encode(strs: List<String>): String {
        val newStrs = strs.map{ if (it.isEmpty()) "ခ" else it }
        return newStrs.joinToString("က")
    }

    fun decode(str: String): List<String> {
        if (str.isEmpty()) return emptyList()
        return str.split('က').map{ if (it == "ခ") "" else it }
    }
}
