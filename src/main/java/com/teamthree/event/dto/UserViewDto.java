package com.teamthree.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserViewDto implements Serializable {

    private long Id;
    private String firstName;
    private String lastName;
    private String email;
}
