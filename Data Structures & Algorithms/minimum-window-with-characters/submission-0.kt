class Solution {
    fun minWindow(s: String, t: String): String {
        val originT = mutableMapOf<Char, Int>()
        val totalCharToHave = t.length
        val size = s.length

        for (c in t) {
            originT[c] = originT.getOrDefault(c, 0) + 1
        }

        // start working
        var left = 0
        var right = 0
        val history = mutableMapOf<Char, Int>()
        val current = StringBuilder()
        val best = StringBuilder()
        // total char to complete
        var toComplete = totalCharToHave

        // skip the inits
        while (right < size) {
            if (originT[s[right]] != null) break
            right ++
            left ++
        }

        while (right < size) {
            val c = s[right]
            current.append(c)
            val currentCount = history.getOrDefault(c, 0) + 1
            val originCount = originT[c]
            if (originCount != null) {
                history[c] = currentCount
                if (currentCount <= originCount) {
                    toComplete--
                }
            }
            // abcyycxxd, xxy
            while (toComplete <= 0 && left <= right) {
                if (best.isEmpty() || current.length < best.length) {
                    best.clear().append(current)
                }
                val fc = s[left]
                if (originT[fc] != null) {
                    if (history.getOrDefault(fc, 0) <= originT[fc]!!) {
                        toComplete++
                    }
                    history[fc] = history.getOrDefault(fc, 0) - 1
                }
                current.deleteAt(0)
                left++
            }

            right++
        }

        return best.toString()
    }
}
