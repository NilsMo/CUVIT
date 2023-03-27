package nl.bioinf.cuvit.models;
/* Author: Nils Mooldijk */

import java.util.List;

public class CurriculumModule {
    enum typeOfAssesment {
        ORAL_EXAM,
        PAPER_EXAM,
        DIGITAL_EXAM
    }

    enum gradingSystems {
        ONETOTEN,
        OVGU
    }

    private String title;
    private String shortDescription;
    private String fullDescription;
    private int ects;
    private gradingSystems gradingSystem;
    private typeOfAssesment assesmentType;
    private List<PrescribedResources> resourcesList;
    private List<CurriculumModule> dependentModules;
    private Programming programming;

}
