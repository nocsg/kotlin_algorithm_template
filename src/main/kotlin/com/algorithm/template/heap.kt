package com.algorithm.template

class Heap {
    fun heapPush(heap: MutableList<Double>, item: Double) {
        heap.add(item)
        siftDown(heap, 0 ,heap.size - 1)
    }

    fun heapPop(heap: MutableList<Double>): Double {
        val lastelt = heap.removeLast()
        if (heap.isNotEmpty()) {
            val returnItem = heap[0]
            heap[0] = lastelt
            siftUp(heap,0)
            return returnItem
        }
        return lastelt
    }

    fun heapify(x:MutableList<Double>) {
        val n = x.size
        for (i in n/2-1 downTo 0) {
            siftUp(x, i)
        }
    }

    private fun siftDown(heap:MutableList<Double>, startPos:Int, pos:Int) {
        var pos = pos
        val newItem = heap[pos]

        while (pos > startPos) {
            val parentPos = (pos - 1) shr 1
            val parent = heap[parentPos]
            if (newItem < parent) {
                heap[pos] = parent
                pos = parentPos
                continue
            }
            break
        }
        heap[pos] = newItem
    }

    private fun siftUp(heap: MutableList<Double>, pos:Int) {
        var pos = pos
        val endPos = heap.size
        val startPos = pos
        val newItem = heap[pos]
        var childPos = pos * 2 + 1
        while (childPos < endPos) {
            val rightPos = childPos + 1
            if (rightPos < endPos && heap[childPos] >= heap[rightPos]) {
                childPos = rightPos
            }
            heap[pos] = heap[childPos]
            pos = childPos
            childPos = 2 * pos + 1
        }
        heap[pos] = newItem
        siftDown(heap, startPos, pos)
    }
}