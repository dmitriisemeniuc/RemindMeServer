package com.semeniuc.dmitrii.remindme.server.service;

import com.semeniuc.dmitrii.remindme.server.entity.Remind;

import java.util.List;

/**
 * Created by Dmitrii on 8/23/2016.
 */
public interface ReminderService {

    List<Remind> getAll();

    Remind getById(long id);

    Remind save(Remind remind);

    void remove(long id);
}
