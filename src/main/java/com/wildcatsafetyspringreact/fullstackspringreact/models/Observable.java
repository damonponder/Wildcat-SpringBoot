package com.wildcatsafetyspringreact.fullstackspringreact.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



@Document(collection = "observables")
public class Observable {

    @Id
    private String _id;

    @NotBlank
    @Size(max = 20)
    private String submittedBy;

    @NotBlank
    @Size(max = 20)
    private String locationOrArea;

    @NotBlank
    @Size(min = 3, max = 20)
    private String observationDate;

    @NotBlank
    @Size(max = 50)
    private String department;

    @NotBlank
    @Size(min = 3, max = 40)
    private String responsibleSupervisor;

    @NotBlank
    private String categoryType;

    @NotBlank
    private List<String> bodyPositionCategories;

    @NotBlank
    private List<String> environmentalConditions;

    @NotBlank
    private List<String> healthCategories;

    @NotBlank
    private List<String> toolsAndEquipmentCategories;

    @NotBlank
    private List<String> procedureAndStandardsCategories;

    @NotBlank
    private List<String> qualityRelatedCategories;

    @NotBlank
    private List<String> useofPPECategories;

    @NotBlank
    private List<String> workingConditionsCategories;

    public Observable(@NotBlank @Size(max = 20) String submittedBy,
                      @NotBlank @Size(max = 20) String locationOrArea,
                      @NotBlank @Size(min = 3, max = 20) String observationDate,
                      @NotBlank @Size(max = 50) String department,
                      @NotBlank @Size(min = 3, max = 40) String responsibleSupervisor,
                      @NotBlank String categoryType,
                      @NotBlank List<String> bodyPositionCategories,
                      @NotBlank List<String> environmentalConditions,
                      @NotBlank List<String> healthCategories,
                      @NotBlank List<String> toolsAndEquipmentCategories,
                      @NotBlank List<String> procedureAndStandardsCategories,
                      @NotBlank List<String> qualityRelatedCategories,
                      @NotBlank List<String> useofPPECategories,
                      @NotBlank List<String> workingConditionsCategories) {
        this.submittedBy = submittedBy;
        this.locationOrArea = locationOrArea;
        this.observationDate = observationDate;
        this.department = department;
        this.responsibleSupervisor = responsibleSupervisor;
        this.categoryType = categoryType;
        this.bodyPositionCategories = bodyPositionCategories;
        this.environmentalConditions = environmentalConditions;
        this.healthCategories = healthCategories;
        this.toolsAndEquipmentCategories = toolsAndEquipmentCategories;
        this.procedureAndStandardsCategories = procedureAndStandardsCategories;
        this.qualityRelatedCategories = qualityRelatedCategories;
        this.useofPPECategories = useofPPECategories;
        this.workingConditionsCategories = workingConditionsCategories;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getLocationOrArea() {
        return locationOrArea;
    }

    public void setLocationOrArea(String locationOrArea) {
        this.locationOrArea = locationOrArea;
    }

    public String getObservationDate() {
        return observationDate;
    }

    public void setObservationDate(String observationDate) {
        this.observationDate = observationDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResponsibleSupervisor() {
        return responsibleSupervisor;
    }

    public void setResponsibleSupervisor(String responsibleSupervisor) {
        this.responsibleSupervisor = responsibleSupervisor;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public List<String> getBodyPositionCategories() {
        return bodyPositionCategories;
    }

    public void setBodyPositionCategories(List<String> bodyPositionCategories) {
        this.bodyPositionCategories = bodyPositionCategories;
    }

    public List<String> getEnvironmentalConditions() {
        return environmentalConditions;
    }

    public void setEnvironmentalConditions(List<String> environmentalConditions) {
        this.environmentalConditions = environmentalConditions;
    }

    public List<String> getHealthCategories() {
        return healthCategories;
    }

    public void setHealthCategories(List<String> healthCategories) {
        this.healthCategories = healthCategories;
    }

    public List<String> getToolsAndEquipmentCategories() {
        return toolsAndEquipmentCategories;
    }

    public void setToolsAndEquipmentCategories(List<String> toolsAndEquipmentCategories) {
        this.toolsAndEquipmentCategories = toolsAndEquipmentCategories;
    }

    public List<String> getProcedureAndStandardsCategories() {
        return procedureAndStandardsCategories;
    }

    public void setProcedureAndStandardsCategories(List<String> procedureAndStandardsCategories) {
        this.procedureAndStandardsCategories = procedureAndStandardsCategories;
    }

    public List<String> getQualityRelatedCategories() {
        return qualityRelatedCategories;
    }

    public void setQualityRelatedCategories(List<String> qualityRelatedCategories) {
        this.qualityRelatedCategories = qualityRelatedCategories;
    }

    public List<String> getUseofPPECategories() {
        return useofPPECategories;
    }

    public void setUseofPPECategories(List<String> useofPPECategories) {
        this.useofPPECategories = useofPPECategories;
    }

    public List<String> getWorkingConditionsCategories() {
        return workingConditionsCategories;
    }

    public void setWorkingConditionsCategories(List<String> workingConditionsCategories) {
        this.workingConditionsCategories = workingConditionsCategories;
    }
}

