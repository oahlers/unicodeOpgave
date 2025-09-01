package com.example.unicodeopgave.Repository;

import com.example.unicodeopgave.Model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnicodeRepo extends JpaRepository<Unicode, Long> {
}
