package rongyan.rntissue.repo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.User;

import java.util.List;

@Repository
public interface UserDao extends PagingAndSortingRepository<User, Integer> {


    //根据等级来查询所有人
    @Query("SELECT u from User u where u.f_user_level= ?1")
    List<User> getAllByLevel(int level);

    List<User> findAll();

}
