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

}
