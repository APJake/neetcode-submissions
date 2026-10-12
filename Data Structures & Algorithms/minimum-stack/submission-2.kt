class MinStack() {
    val arr = mutableListOf<Int>()
    val minArr = mutableListOf<Int>()

    fun push(`val`: Int) {
        val min = minArr.lastOrNull()
        if (min == null || min >= `val`) {
            minArr.add(`val`)
        }
        arr.add(`val`)
    }

    fun pop() {
        if (minArr.isNotEmpty() && top() == getMin()) {
            minArr.removeLast()
        }
        if (arr.isNotEmpty()) {
            arr.removeLast()
        }
    }

    fun top(): Int {
        return arr.last()
    }

    fun getMin(): Int {
        return minArr.last()
    }
}

// 5, 0, 2, 4

// 5, 0

// 

// 5, 2, 3, 4, 1

// 5
// 5, 2
// 5, 2, 1


