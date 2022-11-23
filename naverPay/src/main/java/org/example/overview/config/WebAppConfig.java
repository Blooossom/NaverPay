package org.example.overview.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import javax.sound.sampled.Control;

@Configuration
@ComponentScan(basePackages = "org.example.overview",
useDefaultFilters = false,
includeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,value = (Control.class))})
public class WebAppConfig {

}
