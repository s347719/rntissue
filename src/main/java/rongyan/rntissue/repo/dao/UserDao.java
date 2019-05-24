package rongyan.rntissue.repo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.User;

/**
 * @author lixf
 * @date 2019/3/27
 */
@Repository
public interface UserDao extends CrudRepository<User,Integer> {

    @Query(" SELECT u FROM User u WHERE u.name  = ?1")
    User findUserByName(String name);
}
