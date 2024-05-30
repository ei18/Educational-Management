package com.riwi.educationalManagement.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompleteLessonInformation {
    private Long id;
    private String lessonTitle;
    private String content;
    private CourseResponse course;
    private UserInfoResponse userInfoResponse;
}
