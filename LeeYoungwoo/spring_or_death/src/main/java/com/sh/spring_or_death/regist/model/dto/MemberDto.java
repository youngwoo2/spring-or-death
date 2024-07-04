package com.sh.spring_or_death.regist.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private int memberId;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private Timestamp registrationDate;
}
