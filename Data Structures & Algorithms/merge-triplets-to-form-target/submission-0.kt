class Solution {
    fun mergeTriplets(triplets: Array<IntArray>, target: IntArray): Boolean {
        val hit = BooleanArray(3)
        for (t in triplets) {
            if (t[0] > target[0] || t[1] > target[1] || t[2] > target[2]) continue
            for (i in 0..2) if (t[i] == target[i]) hit[i] = true
        }
        return hit[0] && hit[1] && hit[2]
    }
}
