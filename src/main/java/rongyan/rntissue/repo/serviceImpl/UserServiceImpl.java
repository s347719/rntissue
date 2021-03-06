package rongyan.rntissue.repo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.UserDao;
import rongyan.rntissue.repo.entity.User;
import rongyan.rntissue.repo.service.UserService;

import javax.transaction.Transactional;
import java.util.List;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getListByLevel(int level) {
        return userDao.getAllByLevel(level);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public boolean isExits(String name, String password) {
        User user = userDao.findByNameAndPassword(name, password);
        return user != null;
    }

    @Override
    public boolean isExitsAdmin(String name, String password) {
        User user = userDao.findAdminByNameAndPassword(name, password);
        return user != null;
    }

    @Override
    public boolean isExitsByWX(String openid) {
        User user = userDao.findByF_wx_openId(openid);
        return user != null;
    }
}
