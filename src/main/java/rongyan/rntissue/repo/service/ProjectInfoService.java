package rongyan.rntissue.repo.service;

import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.entity.ProjectInfo;

import java.util.List;

@Service
public interface ProjectInfoService {


    List<ProjectInfo> findAllNotDelete();


    ProjectInfo findById(int id);


    List<ProjectInfo> findAll();


    ProjectInfo findByFStateEquals(int state);

}
