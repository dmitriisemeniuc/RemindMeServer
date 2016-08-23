package com.semeniuc.dmitrii.remindme.server.service;

import com.semeniuc.dmitrii.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {

    List<Remind> getAll();
    Remind getByID(long id);
    Remind save(Remind remind);
    void remove(long id);

}
