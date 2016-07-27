package com.theironyard.services;

import com.theironyard.entities.Article;
import com.theironyard.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer>{
    Article findByTitle(String title);
    Iterable<Article> findByType(String type);
//    ArrayList<Article> findArticleByType(String type);
//    Article findById(int Id);
//    Iterable<Article> findByUserAndCategory(int userId, int categoryId);
//    Iterable<Article> findByUser(int userID);

    @Query ("SELECT ca.CATEGORY_ID, a.Span1 FROM Articles a \n" +
            "INNER JOIN CATEGORY_ARTICLE ca ON ca.article_id = a.ID \n" +
            "INNER JOIN USERS_CATEGORIES uc on uc.catlist_ID = ca.CATEGORY_ID \n" +
            "WHERE uc.user_id = ?")
    Iterable<Article> findByUserCatPref(int UserID);



}
