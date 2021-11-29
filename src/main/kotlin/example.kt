import com.algorithm.template.*

fun test(){
    val arr = mutableListOf<Double>(8.0,5.0, 1.0, 2.0, 3.0, 4.0)
    Heap().heapify(arr)
    Heap().heapPop(arr)
    Heap().heapPush(arr,9.0)
    print(arr)
}


