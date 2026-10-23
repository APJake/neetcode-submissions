class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rSize = matrix.size
        var r = rSize / 2
        var rMin = 0
        var rMax = rSize - 1
        while (r >= rMin && r <= rMax) {
            if (target < matrix[r].first()) {
                // go lower
                rMax = r - 1
                r = rMin + ((r - rMin) / 2)
                continue
            } else if (target > matrix[r].last()) {
                // go upper
                rMin = r + 1
                r = r + ((rMax - r + 1) / 2)
                continue
            }
            
            // correct row
            var cMin = 0
            var cMax = matrix[r].size - 1
            var c = matrix[r].size / 2

            while (c >= cMin && c <= cMax) {
                val v = matrix[r][c]
                if (target == v) return true

                if (target < v) {
                    cMax = c - 1
                    c = cMin + ((c - cMin) / 2)
                } else {
                    cMin = c + 1
                    c = c + ((cMax - c + 1) / 2)
                }
            }

            // no way to be here
            return false
        }
        return false
    }
}
