class Thermostat (val thermometer: ThermometerStub) {
    var fanStatus :Boolean = false
    val upperThreshold :Int = 60
    val lowerThreshold :Int = 40

    fun toggleFanStatus() {
        fanStatus = fanStatus != true
    }

    fun readTemperature() :Int {
        return thermometer.getTemp()
    }
}