package rongyan.rntissue.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.UserDao;
import rongyan.rntissue.repo.entity.User;

import javax.transaction.Transactional;

/**
 * @author lixf
 * @date 2019/3/27
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByName(String name) {
        return userDao.findUserByName(name);
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }
}
