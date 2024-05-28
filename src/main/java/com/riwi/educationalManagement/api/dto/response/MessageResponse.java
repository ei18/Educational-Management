package com.riwi.educationalManagement.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {
    private Long id;
    private String messageContent;
    private LocalDateTime sentDate;
}
