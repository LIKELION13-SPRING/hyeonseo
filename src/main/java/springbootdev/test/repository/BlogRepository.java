package springbootdev.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootdev.test.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
