open class ThermometerStub {
    var currentTemp :Int = 30
    var up = true
    open fun getTemp() :Int {
//        currentTemp = (Math.random() * 70).toInt()
        if (currentTemp == 70) {
            currentTemp -= 1
            up = false
        } else if (currentTemp == 30) {
            currentTemp += 1
            up = true
        } else if (currentTemp < 70 && up) {
            currentTemp += 1
        } else if (currentTemp < 70 && !up) {
            currentTemp -= 1
        }
        return currentTemp
    }
}