package com.riwi.educationalManagement.api.dto.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentRequest {
    private LocalDateTime enrollmentDate;
    private Long userId;
    private Long courseId;
}
