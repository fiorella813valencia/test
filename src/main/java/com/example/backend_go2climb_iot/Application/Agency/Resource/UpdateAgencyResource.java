package com.example.backend_go2climb_iot.Application.Agency.Resource;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAgencyResource {
    private Long id;
    @NotBlank
    @NotNull
    private String name;
    @NotBlank
    @NotNull
    private String email;
    @NotBlank
    @NotNull
    private String password;
    @NotNull
    private Long phoneNumber;
    @NotBlank
    @NotNull
    private String description;
    @NotBlank
    @NotNull
    private String location;
    @NotNull
    private Long ruc;
    @NotBlank
    @NotNull
    private String photo;
    @NotNull
    private int score;
}
