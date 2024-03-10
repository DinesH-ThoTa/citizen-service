package com.dpp.citizenService.repository;

import com.dpp.citizenService.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {


    List<Citizen> findByVaccinationId(Integer integer);
}
