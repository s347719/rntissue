package rongyan.rntissue.repo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.ProjectInfo;

import java.util.List;

@Repository
public interface ProjectInfoDao extends CrudRepository<ProjectInfo, Integer> {


    //查找所有有效没有被删除，忽略状态的项目
    List<ProjectInfo> findAllByAndFIsDeleteEquals(int delete);


    List<ProjectInfo> findAll();


    ProjectInfo findById(int id);

    //1-查找 已经启用的项目  0-查找已经弃用的项目
    ProjectInfo findByFStateEquals(int state);
}
