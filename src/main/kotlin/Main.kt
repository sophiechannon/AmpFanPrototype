fun main() {
    val thermometer = ThermometerStub()
    val thermostat = Thermostat(thermometer)

    while(true) {
        thermostat.reactToTemperatureChange()
    }
}