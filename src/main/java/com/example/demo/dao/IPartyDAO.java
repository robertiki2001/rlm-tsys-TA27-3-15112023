package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Party;

@Repository
public interface IPartyDAO extends JpaRepository<Party, Integer>{

}