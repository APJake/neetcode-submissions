class Solution {
    fun sortMe(str: String): String {
        // should be manual one later
        return str.toCharArray().sorted().joinToString("")
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val memo = mutableMapOf<String, List<String>>()

        strs.forEach { str ->
            val sorted = sortMe(str)
            val historyList = memo[sorted] ?: emptyList()
            memo[sorted] = historyList + listOf(str)
        }

        return memo.values.toList()
    }
}
