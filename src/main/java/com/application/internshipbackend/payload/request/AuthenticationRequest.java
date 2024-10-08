package com.application.internshipbackend.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest implements UserEmailRequest{
    private String email;
    private String password;

    @Builder.Default
    private Long deviceId = null;
}
