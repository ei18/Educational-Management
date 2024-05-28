package com.riwi.educationalManagement.api.dto.response;

import com.riwi.educationalManagement.utils.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private Role role;
}
