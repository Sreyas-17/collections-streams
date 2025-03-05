package com.bridgelabz.generics;

import java.util.*;

abstract class JobRole {
    protected String candidateName;
    protected int experience;

    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    public abstract void evaluateResume();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("Software Engineer Resume \n candidateName:  " + candidateName + "\n Experience: " + experience + " years");
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("\nData Scientist Resume \n candidateName:  " + candidateName + "\n Experience: " + experience + " years");
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("\nProduct Manager Resume \n candidateName: " + candidateName +"\n Experience: " + experience + " years");
    }
}

class Resume<T extends JobRole> {
    private List<T> candidates = new ArrayList<>();

    public void addCandidate(T candidate) {
        candidates.add(candidate);
    }

    public List<T> getCandidates() {
        return candidates;
    }

    public static void displayResumes(List<? extends JobRole> candidates) {

        for (JobRole candidate : candidates) {
            candidate.evaluateResume();
        }
    }
}

public class AI_DrivenResume {
    public static void main(String[] args) {
        SoftwareEngineer software = new SoftwareEngineer("Ravi", 5);
        DataScientist dataScientist = new DataScientist("Vamsi", 3);
        ProductManager productManager = new ProductManager("Manish", 7);

        Resume<SoftwareEngineer> softwareResumes = new Resume<>();
        softwareResumes.addCandidate(software);

        Resume<DataScientist> dataResumes = new Resume<>();
        dataResumes.addCandidate(dataScientist);

        Resume<ProductManager> productResumes = new Resume<>();
        productResumes.addCandidate(productManager);

        Resume.displayResumes(softwareResumes.getCandidates());
        Resume.displayResumes(dataResumes.getCandidates());
        Resume.displayResumes(productResumes.getCandidates());

    }
}

