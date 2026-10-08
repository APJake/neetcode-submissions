class Solution {
    fun isPalindrome(s: String): Boolean {
        val len = s.length
        var i = 0
        var j = s.length - 1
        var countLeft = 0
        var countRight = 0
        var totalChar = len

        while (i <= j && j >= 0) {
            if (!s[i].isLetterOrDigit()) {
                i ++
                continue
            }
            if (!s[j].isLetterOrDigit()) {
                j --
                continue
            }
            val char1 = s[i].lowercaseChar()
            val char2 = s[j].lowercaseChar()
            if (char1 != char2) return false
            i ++
            j --
        }
        return true
    }
}
