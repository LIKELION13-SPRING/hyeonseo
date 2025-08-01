package springbootdev.test.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springbootdev.test.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity(){
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
