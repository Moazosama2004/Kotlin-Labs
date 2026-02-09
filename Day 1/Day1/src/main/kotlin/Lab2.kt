fun main(args: Array<String>){
    var arr = IntArray(100)
    for(i in arr.indices){
        arr[i] = kotlin.random.Random.nextInt(1,100)
        println(if(arr[i] <= 10) arr[i] else continue)
    }
}