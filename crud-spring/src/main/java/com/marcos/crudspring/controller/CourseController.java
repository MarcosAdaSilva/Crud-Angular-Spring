package com.marcos.crudspring.controller;
import com.marcos.crudspring.model.Course;
import com.marcos.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

  private final CourseRepository courseRepository;



  //@RequestMapping(method = RequestMethod.GET)
  @GetMapping
  public @ResponseBody List<Course> list() {
    return courseRepository.findAll();
  }

  //@RequestMapping(method = RequestMethod.POST)
  public void create() {

  }

}
