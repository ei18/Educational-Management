package com.riwi.educationalManagement.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonResponse {
    private Long id;
    private String lessonTitle;
    private String content;
}
