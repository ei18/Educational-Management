package com.riwi.educationalManagement.api.dto.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionRequest {
    private String content;
    private LocalDateTime submissionDate;
    private double grade;
    private Long assignmentId;
    private Long userId;
}
