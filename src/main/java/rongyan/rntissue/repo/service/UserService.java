package rongyan.rntissue.repo.service;

import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.entity.User;

import java.util.List;

@Service
public interface UserService {

    List<User> getListByLevel(int level);


    List<User> findAll();

    boolean isExits(String name ,String password);

    boolean isExitsAdmin(String name ,String password);
}
