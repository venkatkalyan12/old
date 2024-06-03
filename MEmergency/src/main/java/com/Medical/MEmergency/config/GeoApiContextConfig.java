package com.Medical.MEmergency.config;


import com.google.maps.GeoApiContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeoApiContextConfig {

    @Bean
    public GeoApiContext geoApiContext() {
        return new GeoApiContext.Builder()
                .apiKey("YOUR_GOOGLE_MAPS_API_KEY")
                .build();
    }
}
