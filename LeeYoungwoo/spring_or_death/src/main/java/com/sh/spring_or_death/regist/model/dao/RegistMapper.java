package com.sh.spring_or_death.regist.model.dao;

import com.sh.spring_or_death.regist.model.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegistMapper {
<<<<<<< HEAD
    MemberDto checkEmail(String memberEmail);
=======
    int submit(MemberDto memberDto);
>>>>>>> b56f0c62252871e5ef270b84053d1ed55e609049
}
