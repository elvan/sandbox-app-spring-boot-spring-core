package com.github.elvan.springcoredemo.rest;

import com.github.elvan.springcoredemo.common.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  // define a private field for the dependency
  private Coach myCoach;

  // define a constructor for dependency injection
  public DemoController(Coach theCoach) {
    myCoach = theCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

}