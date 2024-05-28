package com.riwi.educationalManagement.api.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentResponse {
    private Long id;
    private String assignmentTitle;
    private String description;
    private LocalDate dueDate;
}
