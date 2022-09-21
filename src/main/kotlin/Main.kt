fun main() {
    val thermometer = ThermometerStub()
    val thermostat = Thermostat(thermometer)

    while(true) {
        if ((thermostat.readTemperature() >= thermostat.upperThreshold) && !thermostat.fanStatus) {
            thermostat.toggleFanStatus()
            println("${thermometer.currentTemp} FAN IS ON. GREEN: ${thermostat.greenLedStatus}, Amber: ${thermostat.amberLedStatus}")
        } else if ((thermostat.readTemperature() <= thermostat.lowerThreshold) && thermostat.fanStatus) {
            thermostat.toggleFanStatus()
            println("${thermometer.currentTemp} FAN IS OFF. GREEN: ${thermostat.greenLedStatus}, Amber: ${thermostat.amberLedStatus}")
        } else {
            println("${thermostat.readTemperature()} - ${thermostat.fanStatus}")
        }
    }
}