class Solution {
    fun sum(n: Int): Int {
        var total = 0
        var num = n
        while (num > 0) {
            val digit = num % 10
            total += digit * digit
            num = num / 10
        }
        return total
    }
    fun isHappy(n: Int): Boolean {
        val history = mutableMapOf<Int, Int>()

        var num = n
        while (true) {
            if (history[num] != null) return false
            if (num == 1) return true
            val tmp = sum(num)
            history[num] = tmp
            num = tmp
        }
        return false
    }
}
