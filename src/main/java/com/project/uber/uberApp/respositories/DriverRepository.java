package com.project.uber.uberApp.respositories;

import com.project.uber.uberApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {


}
