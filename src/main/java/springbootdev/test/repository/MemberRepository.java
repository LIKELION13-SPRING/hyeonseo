package springbootdev.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootdev.test.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByName(String name);
}
