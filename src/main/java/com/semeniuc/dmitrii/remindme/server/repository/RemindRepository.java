package com.semeniuc.dmitrii.remindme.server.repository;

import com.semeniuc.dmitrii.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
