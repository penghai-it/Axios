package it.ph.springboot.vue.axios.dao;

import it.ph.springboot.vue.axios.model.ClassModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassModel record);

    ClassModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassModel record);

    int updateByPrimaryKey(ClassModel record);

    @Select("select * from t_class")
    public List<ClassModel> findClassModel();
}