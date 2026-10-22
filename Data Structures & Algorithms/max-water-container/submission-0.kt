class Solution {
    fun area(heights: IntArray, l: Int, r: Int): Int {
        return min(heights[l], heights[r]) * (r - l)
    }
    fun maxArea(heights: IntArray): Int {
        val size = heights.size
        var bestArea = 0
        var l = 0
        var r = size - 1
        while (l < r) {
            bestArea = max(bestArea, area(heights, l, r))
            if (heights[l] < heights[r]) {
                l++
            } else {
                r--
            }
        }
        return bestArea
    }
}


// left (1) => 7

// right (7) => 6 (6*6=36)
// right (6) => 8 (5*7=35)