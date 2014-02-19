package org.fanjun.service.impl;

import java.util.List;

import org.fanjun.dao.TeacherDao;
import org.fanjun.model.Teacher;
import org.fanjun.service.TeacherSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherServiceImp implements TeacherSevice{
	
	@Autowired
	private TeacherDao teacherDao;
	
	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.save(teacher);
	}

	@Override
	public void edit(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.save(teacher);
	}

	@Override
	public void delete(Teacher teacher) {
		teacherDao.delete(teacher);
		
	}

	@Override
	public Teacher getTeacher(long teacherId) {
		
		return teacherDao.findOne(teacherId);
	}

	@Override
	public List getAllTeacher() {
		
		return (List) teacherDao.findAll();
	}

	@Override
	public List<Teacher> findbyName(String username) {
		// TODO Auto-generated method stub
		return teacherDao.findByUsername(username);
	}

}
