package com.riwi.educationalManagement.api.dto.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequest {
    private String messageContent;
    private LocalDateTime sentDate;
    private Long senderId;
    private Long receiverId;
    private Long courseId;
}
