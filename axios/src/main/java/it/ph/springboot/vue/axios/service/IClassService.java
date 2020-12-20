package it.ph.springboot.vue.axios.service;

import it.ph.springboot.vue.axios.model.ClassModel;

import java.util.List;

public interface IClassService {
    List<ClassModel> queryModel();

    int updetaClass(ClassModel cm);

    int deledaeClass(Integer id);



}
