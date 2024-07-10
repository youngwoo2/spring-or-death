package com.sh.spring_or_death.regist.model.dao;

import com.sh.spring_or_death.regist.model.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegistMapper {
    MemberDto checkEmail(String memberEmail);
}
