package com.example.based.Project.Management.System.Service;

//import com.example.project.models.Project;
//import com.example.project.repositories.ProjectRepository;
import com.example.based.Project.Management.System.Entity.Project;
import com.example.based.Project.Management.System.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public Project updateProject(Long id, Project updatedProject) {
        if (projectRepository.existsById(id)) {
            updatedProject.setId(id);
            return projectRepository.save(updatedProject);
        }
        return null;
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
