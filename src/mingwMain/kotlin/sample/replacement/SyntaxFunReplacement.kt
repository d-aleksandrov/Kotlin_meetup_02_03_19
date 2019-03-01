package sample.replacement

val currentTemperature:Int
    get() {
        calcWeatherMethod1()?.let {
            return it
        }

        calcWeatherMethod2().let{ value2 ->
            if(value2 != Int.MAX_VALUE)
                return value2
        }

        return defaultWeather()
    }

fun someWeatherDiagnostic(){
    middleTemperature = calcMiddle(currentTemperature)
    graphics.add(currentTemperature)
    notify(currentTemperature)
}

lateinit var middleTemperature: Unit

fun notify(currentTemperature: Int) {
    someWeatherDiagnostic()
}

fun calcWeatherMethod1():Int? = 0
fun calcWeatherMethod2():Int = 1
fun defaultWeather():Int = 3

fun calcMiddle(current:Int) = Unit

val graphics = mutableListOf<Int>()