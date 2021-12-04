package com.bsuir.alex.archive.server.service.impl;

import com.bsuir.alex.archive.server.bean.Student;
import com.bsuir.alex.archive.server.dao.DaoException;
import com.bsuir.alex.archive.server.dao.DaoFactory;
import com.bsuir.alex.archive.server.service.ServerUniversityService;
import com.bsuir.alex.archive.server.service.ServerServiceException;

import java.util.List;

public class ServerUniversityServiceImpl implements ServerUniversityService {
    public ServerUniversityServiceImpl() {
    }

    @Override
    public void add(Student student) throws ServerServiceException {
        try {
            DaoFactory.getInstance().getUniversityDao().add(student);
        } catch (DaoException e) {
            throw new ServerServiceException(e);
        }
    }

    @Override
    public void edit(Student student) throws ServerServiceException {
        try {
            DaoFactory.getInstance().getUniversityDao().edit(student);
        } catch (DaoException e) {
            throw new ServerServiceException(e);
        }
    }

    @Override
    public List<Student> getById(String id) throws ServerServiceException {
        try {
            return DaoFactory.getInstance().getUniversityDao().getById(id);
        } catch (DaoException e) {
            throw new ServerServiceException(e);
        }
    }
}
