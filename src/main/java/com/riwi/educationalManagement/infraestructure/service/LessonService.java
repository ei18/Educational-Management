package com.riwi.educationalManagement.infraestructure.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.educationalManagement.api.dto.request.LessonRequest;
import com.riwi.educationalManagement.api.dto.response.CompleteLessonInformation;
import com.riwi.educationalManagement.api.dto.response.CourseResponse;
import com.riwi.educationalManagement.api.dto.response.LessonResponse;
import com.riwi.educationalManagement.api.dto.response.UserInfoResponse;
import com.riwi.educationalManagement.domain.entities.Lesson;
import com.riwi.educationalManagement.domain.repositories.CourseRepository;
import com.riwi.educationalManagement.domain.repositories.LessonRepository;
import com.riwi.educationalManagement.infraestructure.abstract_service.ILessonService;
import com.riwi.educationalManagement.utils.exception.BadRequestException;
import com.riwi.educationalManagement.utils.message.ErrorMessages;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class LessonService implements ILessonService{

    @Autowired
    private final LessonRepository lessonRepository;

    @Autowired
    private final CourseRepository courseRepository;

    @Override
    public LessonResponse create(LessonRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public LessonResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Page<LessonResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public LessonResponse update(LessonRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    private CompleteLessonInformation entityToResponse(CompleteLessonInformation entity){

        return CompleteLessonInformation.builder()
                .id(entity.getId())
                .lessonTitle(entity.getLessonTitle())
                .content(entity.getContent())
                .
                .build();
    }

    private Lesson requestToEntity(LessonRequest request){
        return Lesson.builder()
                .lessonTitle(request.getLessonTitle())
                .content(request.getContent())
                .build();
    }

    private Lesson find(Long id){
        return this.lessonRepository.findById(id)
            .orElseThrow(()-> new BadRequestException(ErrorMessages.IdNotFound("Lesson")));
    }
}
