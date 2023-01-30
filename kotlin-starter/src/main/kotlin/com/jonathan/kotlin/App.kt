import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

//import kotlin.system.measureTimeMillis
@InternalCoroutinesApi

fun main() = /*runBlocking*/ /*runBlocking<Unit>*/ runBlocking(CoroutineName("main")){
//    launch {
//        delay(1000L)
//        println("Coroutines!")
//    }
//
//    println("Hello!")
//    delay(2000L)

//    suspend fun getCapital(): Int {
//        delay(1000L)
//        return 50000
//    }
//
//    suspend fun getIncome(): Int {
//        delay(1000L)
//        return 75000
//    }
//
//    val timeOne = measureTimeMillis {
//        val capital = getCapital()
//        val income = getIncome()
//        println("Your profit is ${income - capital}")
//    }
//
//    val timeTwo = measureTimeMillis {
//        val capital = async { getCapital() }
//        val income = async { getIncome() }
//        println("Your profit is ${income.await() - capital.await()}")
//    }
//
//    println("Completed in $timeOne ms vs $timeTwo ms") // 2115 ms vs 1035 ms

//    val job = launch(start = CoroutineStart.LAZY) {
////        TODO("Not implemented yet!")
//        delay(1000L)
//        println("Start new Job!")
//    }
//
////    job.start() // starts first
//    job.join() // starts later
//    println("Other task")

//    val job = launch {
//        delay(5000)
//        println("Start new job!")
//    }
//
//    delay(2000)
//    job.cancel(cause = CancellationException("time is up!"))
//    println("Cancelling job...")
//    if (job.isCancelled) {
//        println("Job is cancelled because ${job.getCancellationException().message}")
//    }

    /* launch {} // Dispatcher.Default
    * launch(Dispatcher.Default) {}
    * launch(Dispatcher.IO) {}*/

//    launch(Dispatchers.Unconfined) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//    /* Starting in main
//    * Resuming in kotlinx.coroutines.DefaultExecutor*/

//    val dispatcher = newSingleThreadContext("myThread")
//    launch(dispatcher) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//    /* Starting in myThread
//    * Resuming in myThread*/

//    val dispatcher = newFixedThreadPoolContext(3, "myPool")
//    launch(dispatcher) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//    /* Starting in myPool-1
//    * Resuming in myPool-2*/

    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")) {
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
    }

    repeat(5) { println(channel.receive())}
    println("received in ${Thread.currentThread().name}")
    /*Sending from main @v1coroutine#2
    * 1
    * 4
    * 9
    * 16
    * 25
    * received in main @main#1*/
}