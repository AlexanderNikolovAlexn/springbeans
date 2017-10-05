package com.samodeika.spring.AnnotationConfiguration.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BeanProject {

    @Autowired
    private Dev dev;
    private Analyst analyst;
    private List<Qa> qaList;
    private ProjectManager projectManager;

    @Autowired
    public BeanProject(Dev dev, Analyst analyst, List<Qa> qaList) {
        this.dev = dev;
        this.analyst = analyst;
        this.qaList = qaList;
    }

    public Dev getDev() {
        return dev;
    }

    public void setDev(Dev dev) {
        this.dev = dev;
    }

    public Analyst getAnalyst() {
        return analyst;
    }

    public void setAnalyst(Analyst analyst) {
        this.analyst = analyst;
    }

    public List<Qa> getQaList() {
        return qaList;
    }

    public void setQaList(List<Qa> qaList) {
        this.qaList = qaList;
    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    @Autowired
    @Qualifier("main")
    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    @Override
    public String toString() {
        return "BeanProject{" +
                "dev=" + dev +
                ", analyst=" + analyst +
                ", qaList=" + qaList +
                ", projectManager=" + projectManager +
                '}';
    }
}
