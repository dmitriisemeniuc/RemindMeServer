package com.semeniuc.dmitrii.remindme.server.repository;

import com.semeniuc.dmitrii.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dmitrii on 8/23/2016.
 */
public interface RemindRepository extends JpaRepository<Remind, Long>{
}
