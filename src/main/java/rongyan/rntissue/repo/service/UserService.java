package rongyan.rntissue.repo.service;


import rongyan.rntissue.repo.entity.User;

/**
 * @author lixf
 * @date 2019/3/27
 */
public interface UserService {

    User findByName(String name);

    void saveUser(User user);
}
