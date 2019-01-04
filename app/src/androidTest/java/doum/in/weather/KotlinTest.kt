package doum.`in`.weather

import android.support.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import rx.Observable
import rx.Subscriber
import java.util.*
import java.util.Arrays.asList




@RunWith(AndroidJUnit4::class)
class KotlinTest {

    @Test
    fun testBackOff() {
        val list = Arrays
                .asList("One", "Two", "Three", "Four", "Five")

        val observable = Observable.from(list)

        observable.subscribe(object : Subscriber<String>() {
            override fun onStart() {
                println("onStart")
            }

            override fun onCompleted() {
                println("Completed!")
            }

            override fun onError(e: Throwable) {
                println("Exception thrown: $e")
            }

            override fun onNext(s: String) {
                println("Next element: $s")
            }
        })
    }
}