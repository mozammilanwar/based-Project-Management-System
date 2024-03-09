package com.example.based.Project.Management.System.Repository;

//package com.example.project.repositories;

//import com.example.project.models.Project;
import com.example.based.Project.Management.System.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

