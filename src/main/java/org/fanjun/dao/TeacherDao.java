package org.fanjun.dao;



import org.fanjun.model.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeacherDao extends CrudRepository<Teacher, Long> {
    List<Teacher> findByUsername(String username);
}
