package net.chandol.study.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends RevisionRepository<Article, Long, Integer>, JpaRepository<Article, Long> {
}
