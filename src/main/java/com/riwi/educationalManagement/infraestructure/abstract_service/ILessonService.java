package com.riwi.educationalManagement.infraestructure.abstract_service;

import com.riwi.educationalManagement.api.dto.request.LessonRequest;
import com.riwi.educationalManagement.api.dto.response.LessonResponse;

public interface ILessonService extends CrudServices<LessonRequest, LessonResponse, Long>{
}
