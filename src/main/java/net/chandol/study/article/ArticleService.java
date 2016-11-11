package net.chandol.study.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository repository;

    @PostConstruct
    @Transactional
    public void before() {
        Article article1 = repository.save(new Article("aaa1", "bbb1", "a"));
        Article article2 = repository.save(new Article("aaa2", "bbb2", "b"));
        Article article3 = repository.save(new Article("aaa3", "bbb3", "c"));


        article1.modify("anotherTitle", "anotherContents");
        repository.save(article1);
    }
}
