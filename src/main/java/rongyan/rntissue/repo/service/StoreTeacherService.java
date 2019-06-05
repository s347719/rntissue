package rongyan.rntissue.repo.service;

import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.entity.StoreTeacher;

import java.util.List;

@Service
public interface StoreTeacherService {

    StoreTeacher findTeacherByName(String name);


    List<StoreTeacher> findAll();



}
