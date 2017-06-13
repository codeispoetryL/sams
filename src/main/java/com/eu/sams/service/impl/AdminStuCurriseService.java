package com.eu.sams.service.impl;

import com.eu.sams.dao.IAdminStuCourseDao;
import com.eu.sams.dao.impl.AdminStuCourseDao;
import com.eu.sams.entity.CurriseBean;
import com.eu.sams.service.IAdminStuCurriseService;

import java.util.List;

/**
 * Created by 马欢欢 on 2017/6/12.
 */
public class AdminStuCurriseService implements IAdminStuCurriseService {
    private IAdminStuCourseDao adminCourseDao = new AdminStuCourseDao();
    public List<CurriseBean> Admin_TeacherFindCourse() {
        try{
            return adminCourseDao.Admin_TeacherFindCourse();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
