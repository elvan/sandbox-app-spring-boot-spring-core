package com.github.elvan.springcoredemo.config;

import com.github.elvan.springcoredemo.common.Coach;
import com.github.elvan.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

  @Bean("aquatic")
  public Coach swimCoach() {
    return new SwimCoach();
  }

}
