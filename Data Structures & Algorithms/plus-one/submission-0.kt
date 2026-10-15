class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var hasCarry = true
        var i = digits.size - 1
        while (i >= 0 && hasCarry) {
            val tt = digits[i] + 1
            if (tt <= 9) {
                digits[i] = tt
                hasCarry = false
            } else {
                digits[i] = 0
            }
            i--
        }
        return if (hasCarry) intArrayOf(1)+digits else digits
    }
}
