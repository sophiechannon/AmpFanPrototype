class Thermostat (val thermometer: ThermometerStub) {
    var fanStatus :Boolean = false
    var amberLedStatus :Boolean = false
    var greenLedStatus :Boolean = true
    val upperThreshold :Int = 60
    val lowerThreshold :Int = 40

    fun toggleFanStatus() {
        fanStatus = fanStatus != true
        toggleAmberLed()
        toggleGreenLed()
    }

    fun readTemperature() :Int {
        return thermometer.getTemp()
    }

    fun toggleAmberLed() {
        amberLedStatus = amberLedStatus != true
    }

    fun toggleGreenLed(){
        greenLedStatus = greenLedStatus != true
    }
}