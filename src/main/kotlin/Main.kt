fun main(args: Array<String>) {
    val thermometer = ThermometerStub()
    val thermostat = Thermostat(thermometer)

    while(true) {
        if ((thermostat.readTemperature() >= thermostat.upperThreshold) && !thermostat.fanStatus) {
            thermostat.toggleFanStatus()
            println("${thermometer.currentTemp} FAN IS ON")
        } else if ((thermostat.readTemperature() <= thermostat.lowerThreshold) && thermostat.fanStatus) {
            thermostat.toggleFanStatus()
            println("${thermometer.currentTemp} FAN IS OFF")
        } else {
            println("${thermostat.readTemperature()} - ${thermostat.fanStatus}")
        }
    }
}