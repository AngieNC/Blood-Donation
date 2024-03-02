package com.example.BloodDonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BloodDonation.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
