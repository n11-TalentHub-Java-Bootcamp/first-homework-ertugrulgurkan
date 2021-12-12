package com.ertugrul.dao;

import com.ertugrul.base.BaseDao;
import com.ertugrul.dto.UserActionDto;
import com.ertugrul.entity.User;
import org.hibernate.query.Query;

import java.util.List;

public class UserDao extends BaseDao {

    public List<User> findAll() {

        Query query = getCurrentSession().createQuery(
                "select user from User user");

        return (List<User>) query.list();
    }

    public List<UserActionDto> findUserCommentsByUserId(Long id) {
        String sql = " select " +
                " new com.ertugrul.dto.UserActionDto( user.id, user.name, product.name, productComment.comment, productComment.commentDate ) " +
                " from User user, ProductComment productComment, Product product " +
                " where 1=1" +
                " and product.id = productComment.product.id" +
                " and user.id = productComment.user.id" +
                " and user.id = :id";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);

        return (List<UserActionDto>) query.list();
    }
}