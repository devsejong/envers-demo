package net.chandol.study.article;

import lombok.Data;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Audited
public class Article{
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String contents;
    private String author;

    @NotAudited
    private LocalDateTime created;

    protected Article() {}

    public Article(String title, String contents, String author) {
        this.title = title;
        this.contents = contents;
        this.author = author;
        this.created = LocalDateTime.now();
    }

    public void modify(String title, String contents){
        this.title = title;
        this.contents = contents;
    }
}
