package com.wildcatsafetyspringreact.fullstackspringreact.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

public class ObservableRequest {

    @NotBlank
    @Size(max = 20)
    private String submittedBy;

    private Set<String> roles;

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


    public String getSubmittedBy() {return submittedBy; }

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

    public void setDepartment(String department) {this.department = department; }

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
    public Set<String> getRoles() {
        return this.roles;
    }

    public void setRole(Set<String> roles) {
        this.roles = roles;
    }
}
