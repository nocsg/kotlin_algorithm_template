# kotlin_algorithm_template
## 1.Heap queue algorithm

This module provides an implementation of the heap queue algorithm, also known as the priority queue algorithm. To create a heap, use a list initialized, or you can transform a populated list into a heap via function heapify().

The following functions are provided:

`heap().heappush(heap, item)`
Push the value item onto the heap, maintaining the heap invariant.

`heapq().heappop(heap)`
Pop and return the smallest item from the heap, maintaining the heap invariant. If the heap is empty, IndexError is raised. To access the smallest item without popping it, use heap[0].

`heapq().heapify(x)`
Transform list x into a heap, in-place, in linear time.
