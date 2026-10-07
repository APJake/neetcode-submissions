class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val history = mutableMapOf<Char, Int>()
        if (s.length != t.length) return false

        for (ss in s) {
            history[ss] = (history[ss] ?: 0) + 1
        }

        for (tt in t) {
            val prev = history[tt] ?: 0
            if (prev == null || prev == 0) return false
            history[tt] = prev - 1
        }

        return history.values.all { it == 0 }
    }
}
