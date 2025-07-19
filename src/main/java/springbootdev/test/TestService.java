package springbootdev.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootdev.test.domain.Member;
import springbootdev.test.repository.MemberRepository;

import java.util.List;

@Service
public class TestService {
    @Autowired
    MemberRepository memberRepository;
    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }
}
