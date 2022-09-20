open class ThermometerStub {
    open fun getTemp() :Int {
        return (Math.random() * 100).toInt()
    }
}