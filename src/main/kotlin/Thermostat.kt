class Thermostat (val thermometer: ThermometerStub) {
    var fanStatus :Boolean = false
    var redLedStatus :Boolean = false
    var amberLedStatus :Boolean = false
    var greenLedStatus :Boolean = true
    val upperThreshold :Int = 60
    val lowerThreshold :Int = 40
    val overheatingThreshold :Int = 70

    fun reactToTemperatureChange() {
        if (readTemperature() >= overheatingThreshold) {
            alertToOverheat()
            print("WARNING! ")
            printStatus()
        } else if (readTemperature() >= upperThreshold) {
            turnOnFan()
            printStatus()
        } else if (readTemperature() <= lowerThreshold) {
            turnOffFan()
            printStatus()
        } else if ((readTemperature() <= upperThreshold) && fanStatus) {
            turnOnFan()
            println("${readTemperature()} - $fanStatus")
        } else {
            readTemperature()
            turnOffFan()
            println("${readTemperature()} - $fanStatus")
        }
    }

    private fun turnOnFan() {
        fanStatus = true
        redLedStatus = false
        amberLedStatus = true
        greenLedStatus = false
    }
    private fun turnOffFan() {
        fanStatus = false
        redLedStatus = false
        amberLedStatus = false
        greenLedStatus = true
    }

    private fun alertToOverheat() {
        fanStatus = true
        redLedStatus = true
        amberLedStatus = false
        greenLedStatus = false
    }

    private fun readTemperature() :Int {
        return thermometer.getTemp()
    }

    private fun printStatus() {
        println("${thermometer.currentTemp} FAN: $fanStatus. GREEN: $greenLedStatus, Amber: $amberLedStatus, RED: $redLedStatus")
    }
}