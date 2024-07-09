package com.sh.spring_or_death.regist.model.service;

import com.sh.spring_or_death.regist.model.dao.RegistMapper;
import com.sh.spring_or_death.regist.model.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistService {
    private final RegistMapper registMapper;
    public int submit(MemberDto memberDto) {

        return registMapper.submit(memberDto);
    }

}
