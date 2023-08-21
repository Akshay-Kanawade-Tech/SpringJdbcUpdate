package org.mahagan.software.service.domain;

public class Project {

    private int projectNo;
    private String title;
    private String description;
    private int duration;
    private String status;

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // generating parameterized constructor

    public Project(int projectNo, String title, String description, int duration, String status) {
        this.projectNo = projectNo;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.status = status;
    }

    //generating toString methods


    @Override
    public String toString() {
        return "Project{" +
                "projectNo=" + projectNo +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                '}';
    }
}
