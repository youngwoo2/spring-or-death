package com.sh.spring_or_death.regist.model.service;

import com.sh.spring_or_death.regist.model.dao.RegistMapper;
import com.sh.spring_or_death.regist.model.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistService {
    private final RegistMapper registMapper;
<<<<<<< HEAD

    public MemberDto checkEmail(String memberEmail) {
        return registMapper.checkEmail(memberEmail);
    }
=======
    public int submit(MemberDto memberDto) {

        return registMapper.submit(memberDto);
    }

>>>>>>> b56f0c62252871e5ef270b84053d1ed55e609049
}
