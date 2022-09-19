# Amp Thermostat

This Java program is a mockup / proof of concept for thermostat software designed to work with hardware to control the temperature of an amplifier.

## User Stories

As an amp owner,
So I can ensure my amp is not breaking,
I'd like to be warned when it is beginning to overheat.

As an amp owner,
So my amplifier doesn't overheat at parties,
I'd like a fan to control its temperature.

## Features (software)

### State / constants

- Knows the current temperature of the amp
- Knows when to turn on/off the fan
- Knows when to turn on/off each LED
- Knows optimum fan speeds (this is unlikely to feature in this mock up as it needs real world testing)
- Knows current fan speed (as above)

### Behaviour / functions

- Can get temperature readings from the sensor
- Can turn on / off LEDs based on temperature readings from the sensor
- Can turn on / off fan based on temperature readings from the sensor
- Can set fan to max (manual override)

## Features (hardware)

- Built on arduino board
- Temperature sensor
- Fan that comes on based on temperature sensor readings
- Fan is on an analogue output to control speed
- Green LED to indicate that amp is below threshold
- Amber LED to indicate that fan is on
- Red LED to indicate that amp has continued to heat up despite fan being on and needs manual intervention
- Override button (set fan to max / set back to automatic)

## MVP

- LEDs turn on at certain temperatures
- Fan turns off at a set temperature
- Fan turns off at a set temperature