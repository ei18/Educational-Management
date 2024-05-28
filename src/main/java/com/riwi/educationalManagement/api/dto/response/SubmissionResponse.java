package com.riwi.educationalManagement.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionResponse {
    private Long id;
    private String content;
    private LocalDateTime submissionDate;
    private double grade;    
}
