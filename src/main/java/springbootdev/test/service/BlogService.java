package springbootdev.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springbootdev.test.domain.Article;
import springbootdev.test.dto.AddArticleRequest;
import springbootdev.test.repository.BlogRepository;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
