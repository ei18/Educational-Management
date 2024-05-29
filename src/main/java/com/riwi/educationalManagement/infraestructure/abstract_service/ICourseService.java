package com.riwi.educationalManagement.infraestructure.abstract_service;

import com.riwi.educationalManagement.api.dto.request.CourseRequest;
import com.riwi.educationalManagement.api.dto.response.CourseResponse;

public interface ICourseService extends CrudServices<CourseRequest, CourseResponse, Long>{
}
