package com.semeniuc.dmitrii.remindme.server.service;

import com.semeniuc.dmitrii.remindme.server.entity.Remind;
import com.semeniuc.dmitrii.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dmitrii on 8/23/2016.
 */
@Service
public class ReminderServiceImpl implements ReminderService{

    @Autowired
    private RemindRepository repository;

    @Override
    public List<Remind> getAll() {
        return repository.findAll();
    }

    @Override
    public Remind getById(long id) {
        return repository.findOne(id);
    }

    @Override
    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    @Override
    public void remove(long id) {
        repository.delete(id);
    }
}
