package com.riwi.educationalManagement.api.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.educationalManagement.api.dto.request.CourseRequest;
import com.riwi.educationalManagement.api.dto.request.LessonRequest;
import com.riwi.educationalManagement.api.dto.response.CompleteLessonInformationResponse;
import com.riwi.educationalManagement.api.dto.response.CourseToUserResponse;
import com.riwi.educationalManagement.domain.entities.Course;
import com.riwi.educationalManagement.infraestructure.abstract_service.ICourseService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/courses")
@AllArgsConstructor
public class CourseController {
    private final ICourseService courseService;

     @GetMapping
    public ResponseEntity<Page<CourseToUserResponse>> getAll(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size){
        return  ResponseEntity.ok(this.courseService.getAll(page -1, size));
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<CourseToUserResponse> get(@PathVariable Long id){
        return ResponseEntity.ok(this.courseService.get(id));
    }

    @PostMapping
    public ResponseEntity<CourseToUserResponse> create(@Validated @RequestBody CourseRequest request){
        return ResponseEntity.ok(this.courseService.create(request));
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<CourseToUserResponse> update(@Validated @RequestBody CourseRequest request, @PathVariable Long id){
        return ResponseEntity.ok(this.courseService.update(request, id));
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.courseService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
