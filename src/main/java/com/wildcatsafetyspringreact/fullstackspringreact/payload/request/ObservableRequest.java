package com.wildcatsafetyspringreact.fullstackspringreact.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class ObservableRequest {

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
    @Email
    private String department;

    @NotBlank
    @Size(min = 6, max = 40)
    private String responsibleSupervisor;

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

}
