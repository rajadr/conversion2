package com.ps.conversion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {

    // Conversion - Kelvin to Celcius
    @GetMapping("/conversions/ktoc")
    public double ktoc(@RequestParam(value = "temp", defaultValue = "0.0") String temp) {
        double temp_in_k  = Double.valueOf(temp);

        // Celcium = Kelvin - 273.15
        // Celsius to Fahrenheit = Celsius * (9/5) + 32

        double temp_in_c = temp_in_k - 273.15;
        String tempVal = String.format("%1.2f", temp_in_c);
        temp_in_c = Double.valueOf(tempVal);

        System.out.println("Kelvin Temp: "+temp+" and Celcius Equivalent: "+temp_in_c);

        return temp_in_c;
    }

    // Conversion - Celcius to Kelvin
    @GetMapping("/conversions/ctok")
    public double ctok(@RequestParam(value = "temp", defaultValue = "0.0") String temp) {
        double temp_in_c  = Double.valueOf(temp);

        // Kelvin = Celcium + 273.15

        double temp_in_k = temp_in_c + 273.15;
        String tempVal = String.format("%1.2f", temp_in_k);
        temp_in_k = Double.valueOf(tempVal);

        System.out.println("Celcius Temp: "+temp+" and Equivalent Kelvin: "+temp_in_k);

        return temp_in_k;
    }

    // Conversion - miles to kilometers
    @GetMapping("/conversions/mtok")
    public Double mtok(@RequestParam(value = "dist", defaultValue = "0.0") String dist) {
        double dist_in_mile  = Double.valueOf(dist);

        // 1 mile = 1.609344 kms
        double dist_in_km = dist_in_mile * 1.609344;
        String tempVal = String.format("%1.2f", dist_in_km);
        dist_in_km = Double.valueOf(tempVal);

        System.out.println(dist+" Miles are equivalent to : "+dist_in_km+" Kilometers");

        return dist_in_km;
    }
    // Conversion - kilometers to miles
    @GetMapping("/conversions/ktom")
    public double ktom(@RequestParam(value = "dist", defaultValue = "0.0") String dist) {
        double dist_in_km  = Double.valueOf(dist);

        // 1 km = 0.621371 mile
        double dist_in_mile = dist_in_km * 0.621371;
        String tempVal = String.format("%1.2f", dist_in_mile);
        dist_in_mile = Double.valueOf(tempVal);

        System.out.println(dist+" Kilometers are Equivalent to"+dist_in_mile+" Miles");

        return dist_in_mile;
    }

}
