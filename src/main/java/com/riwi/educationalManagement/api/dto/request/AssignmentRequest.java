package com.riwi.educationalManagement.api.dto.request;

import java.time.LocalDate;
import java.util.List;

import com.riwi.educationalManagement.domain.entities.Submission;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentRequest {
    @NotBlank(message = "The title is required")
    private String assignmentTitle;
    private String description;
    private LocalDate dueDate;
    private Long lessonId;
    private List<Submission> submissionList;
}
