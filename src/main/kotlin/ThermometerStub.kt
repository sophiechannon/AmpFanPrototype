open class ThermometerStub {
    var currentTemp :Int = 30
    var highest :Int = 90
    var lowest :Int = 30
    var up = true
    open fun getTemp() :Int {
        if (currentTemp == highest) {
            currentTemp -= 1
            up = false
        } else if (currentTemp == lowest) {
            currentTemp += 1
            up = true
        } else if (currentTemp < highest && up) {
            currentTemp += 1
        } else if (currentTemp < highest && !up) {
            currentTemp -= 1
        }
        return currentTemp
    }
}